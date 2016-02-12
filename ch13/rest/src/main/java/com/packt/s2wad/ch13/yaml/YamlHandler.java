package com.packt.s2wad.ch13.yaml;

import java.io.IOException;

import org.apache.struts2.rest.handler.ContentTypeHandler;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.ho.yaml.Yaml;

import java.io.Reader;
import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;

public class YamlHandler implements ContentTypeHandler {

    private static Log _log = LogFactory.getLog(YamlHandler.class);

    public void toObject(Reader reader, Object o) throws IOException {
    }

    public String fromObject(Object o, String s, Writer writer) throws IOException {
        if (o == null) {
            _log.debug("Not serializing null object.");
            return null;
        }

        writer.write(Yaml.dump(o));

        return null;
    }

    public String getContentType() {
        return "text/plain";
    }

    public String getExtension() {
        return "yaml";
    }

}
