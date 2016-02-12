package com.packt.s2wad.ch14.interceptors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.commons.lang.StringUtils;

public class TrimInterceptor extends MethodFilterInterceptor {

    private List<String> excluded = new ArrayList<String>();

    protected String doIntercept(ActionInvocation invocation) throws Exception {
        Map<String, Object> parameters = invocation.getInvocationContext().getParameters();

        for (String param : parameters.keySet()) {
            if (isIncluded(param)) {
                String[] vals = (String[]) parameters.get(param);
                for (int i = 0; i < vals.length; i++) {
                    vals[i] = vals[i].trim();
                }
            }
        }

        return invocation.invoke();
    }

    private boolean isIncluded(String param) {
        for (String exclude : excluded) {
            if (param.startsWith(exclude)) {
                return false;
            }
        }

        return true;
    }

    public boolean isExcluded(String param) {
        return !isIncluded(param);
    }

    public void setExcludedParams(String excludedParams) {
        for (String s : StringUtils.split(excludedParams, ",")) {
            excluded.add(s.trim());
        }
    }

}
