package com.packt.s2wad.ch06.actions.examples;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Action;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Results({
        @Result(name = ActionSupport.INPUT,
                location = "/WEB-INF/content/examples/file-upload.jsp"),
        @Result(name = ActionSupport.SUCCESS,
                location = "/WEB-INF/content/examples/file-upload.jsp")
})
public class FileUploadAction extends ActionSupport {

    private File file1;
    private String file1ContentType;
    private String file1Name;

    private static final Log LOG = LogFactory.getLog(FileUploadAction.class);

    @Action(value = "file-upload-process")
    public String process() throws Exception {
        LOG.debug("Enter; file size=" + file1.length());
        LOG.debug("            type=" + file1ContentType);
        LOG.debug("            name=" + file1Name);
        return SUCCESS;
    }

    @Override
    @Action(value = "file-upload")
    public String input() throws Exception {
        return INPUT;
    }

    public File getFile1() {
        return file1;
    }

    public void setFile1(File file1) {
        this.file1 = file1;
    }

    public String getFile1ContentType() {
        return file1ContentType;
    }

    public void setFile1ContentType(String file1ContentType) {
        this.file1ContentType = file1ContentType;
    }

    public String getFile1Name() {
        return file1Name;
    }

    public void setFile1Name(String file1Name) {
        this.file1Name = file1Name;
    }

}
