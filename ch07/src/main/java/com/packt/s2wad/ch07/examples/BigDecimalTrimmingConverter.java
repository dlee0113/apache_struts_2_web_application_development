package com.packt.s2wad.ch07.examples;

import java.util.Map;
import java.math.BigDecimal;

import com.opensymphony.xwork2.conversion.TypeConversionException;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.util.StrutsTypeConverter;

public class BigDecimalTrimmingConverter extends StrutsTypeConverter {

    private static final Log LOG = LogFactory.getLog(BigDecimalTrimmingConverter.class);

    public Object convertFromString(Map context, String[] values, Class toClass) {
        LOG.debug("Enter.");

        if (null == values) {
            return null;
        }

        if (values.length != 1) {
            throw new TypeConversionException(String.format("Array to big: [%s]", StringUtils.join(values, ", ")));
        }

        return values[0] == null ? null : new BigDecimal(values[0].trim());
    }

    public String convertToString(Map context, Object o) {
        LOG.debug("Enter.");

        if ((o == null) || (!(o instanceof BigDecimal))) {
            LOG.debug("Null or not a BigDecimal; returning empty string...");
            return "";
        }

        BigDecimal val = (BigDecimal) o;
        String ret = val.toString();
        LOG.debug("Non-null BigDecimal, returning toString: " + ret);
        return ret;
    }

}
