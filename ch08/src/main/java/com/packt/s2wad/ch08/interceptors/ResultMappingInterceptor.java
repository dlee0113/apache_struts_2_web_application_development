package com.packt.s2wad.ch08.interceptors;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.PreResultListener;
import ognl.Ognl;
import ognl.OgnlException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ResultMappingInterceptor extends AbstractInterceptor {

    private Map<String, String> mappings;
    private static final Log LOG = LogFactory.getLog(ResultMappingInterceptor.class);

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        invocation.addPreResultListener(new PreResultListener() {
            public void beforeResult(ActionInvocation invocation, String resultCode) {
                invocation.setResultCode(mapResult(resultCode));
            }
        });
        return mapResult(invocation.invoke());
    }

    public String mapResult(String from) {
        return mappings.containsKey(from) ? mappings.get(from) : from;
    }

    public void setMap(String mapExpr) {
        try {
            Object o = Ognl.getValue(mapExpr, null);
            if (o != null && o instanceof Map) {
                mappings = (Map) o;
            }
        } catch (OgnlException e) {
            LOG.error("Error parsing map expression", e);
        }
    }

}
