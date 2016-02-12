package com.packt.s2wad.ch04.examples;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.StrutsStatics;
import org.apache.struts2.dispatcher.StrutsResultSupport;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.petebevin.markdown.MarkdownProcessor;

public class MarkdownResult extends StrutsResultSupport {

    private String defaultEncoding = "ISO-8859-1";

    private static final Log LOG = LogFactory.getLog(MarkdownResult.class);

    public void doExecute(final String finalLocation,
                          final ActionInvocation invocation)
           throws Exception {
        String markdownInput = readFromContextPath(invocation, finalLocation);
        if ((markdownInput == null) || (markdownInput.length() == 0)) {
            // FIXME Like our error handling?
        }

        MarkdownProcessor p = new MarkdownProcessor();
        String markdown = p.markdown(markdownInput);

        ActionContext actionContext = invocation.getInvocationContext();
        HttpServletResponse response = ServletActionContext.getResponse();
        byte[] markdownBytes = markdown.getBytes(defaultEncoding);
        response.setContentLength(markdownBytes.length);
        response.setContentType("text/html;charset=" + this.defaultEncoding);

        PrintWriter out = response.getWriter();
        out.print(markdown);
    }

    private String readFromContextPath(ActionInvocation invocation, String finalLocation) {
        ServletContext servletContext = ServletActionContext.getServletContext();
        File inFile = new File(servletContext.getRealPath(finalLocation));
        if (!inFile.exists()) {
            // FIXME More awesome error handling.
            return "";
        }

        try {
            return FileUtils.readFileToString(inFile, defaultEncoding);
        } catch (IOException e) {
            LOG.error(e);
        }

        return "";
    }

}
