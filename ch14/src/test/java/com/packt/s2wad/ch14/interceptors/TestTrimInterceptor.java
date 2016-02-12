package com.packt.s2wad.ch14.interceptors;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionProxyFactory;
import com.opensymphony.xwork2.config.Configuration;
import com.opensymphony.xwork2.config.ConfigurationManager;
import com.opensymphony.xwork2.inject.Container;
import com.opensymphony.xwork2.mock.MockActionInvocation;
import com.opensymphony.xwork2.util.XWorkTestCaseHelper;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class TestTrimInterceptor {

    private TrimInterceptor trim;
    private ConfigurationManager configurationManager;
    private Configuration configuration;
    private Container container;
    private ActionProxyFactory actionProxyFactory;

    @Before
    public void setup() throws Exception {
        trim = new TrimInterceptor();
        trim.setExcludedParams("simple, nested.simple, indexed, complex.foo");

        configurationManager = XWorkTestCaseHelper.setUp();
        configuration = configurationManager.getConfiguration();
        container = configuration.getContainer();
        actionProxyFactory = container.getInstance(ActionProxyFactory.class);
    }

    @Test
    public void testTrimming() {
        testTrimming("foo", " hello ", "hello");
        testTrimming("complex.nar", " hello ", "hello");
        testTrimming("simple", " hello ", " hello ");
        testTrimming("complex.foo[1]", " hello ", " hello ");
    }

    private void testTrimming(final String param, final String val, final String expected) {
        MockActionInvocation i = setupInvocation(param, val);
        try {
            trim.doIntercept(i);
            Map<String, Object> params = i.getInvocationContext().getParameters();
            assertTrue("Parameters contains param key", params.containsKey(param));
            String newVal = ((String[]) params.get(param))[0];
            assertTrue("Trim operation correct.", newVal.equals(expected));
        } catch (Exception e) {
            assertTrue("Should not have gotten exception", false);
        }
    }

    @SuppressWarnings("serial")
    private MockActionInvocation setupInvocation(final String param, final String val) {
        Map<String, Object> params = new HashMap<String, Object>() {{
            put(param, new String[]{val});
        }};
        MockActionInvocation i = new MockActionInvocation();
        ActionContext c = ActionContext.getContext();
        c.setParameters(params);
        i.setInvocationContext(c);
        return i;
    }

    @Test
    public void testIncluded() {
        shouldBeIncluded("foo");
        shouldBeIncluded("foo");
        shouldBeIncluded("foo.bar");
        shouldBeIncluded("foo[1]");
        shouldBeIncluded("foo[1].bar");
        shouldBeIncluded("foo[1].bar[1]");
        shouldBeIncluded("foo[1].bar[1].nar");
    }

    public void shouldBeIncluded(String s) {
        assertFalse(s + " is included", trim.isExcluded(s));
    }

    @Test
    public void testSimpleExcluded() {
        shouldBeExcluded("simple");
        shouldBeExcluded("simple.nested");
        shouldBeExcluded("simple.nested[1]");
        shouldBeExcluded("simple.nested[1].nar");
        shouldBeExcluded("simple[1]");
        shouldBeExcluded("simple[1].nested");
        shouldBeExcluded("simple[1].nested[1]");
        shouldBeExcluded("simple[1].nested[1].foo");
    }

    @Test
    public void testNestedSimple() {
        shouldBeExcluded("nested.simple");
        shouldBeIncluded("nested[0].simple");
        shouldBeExcluded("nested.simple[0]");
        shouldBeExcluded("nested.simple.foo");
        shouldBeExcluded("nested.simple[0].bar");
        shouldBeExcluded("nested.simple.foo.bar");
    }

    @Test
    public void testIndexed() {
        shouldBeExcluded("indexed[0]");
        shouldBeExcluded("indexed[0].foo");
        shouldBeExcluded("indexed[0].foo[0]");
        shouldBeExcluded("indexed");
    }

    public void shouldBeExcluded(String s) {
        assertTrue(s + " is excluded", trim.isExcluded(s));
    }

}
