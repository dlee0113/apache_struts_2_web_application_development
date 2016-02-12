package com.packt.s2wad.ch07.examples;

import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;
import com.opensymphony.xwork2.validator.ValidationException;
import com.packt.s2wad.ch07.examples.ClassificationService;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

public class ClassificationValidator extends FieldValidatorSupport {

    private static final Log LOG = LogFactory.getLog(ClassificationValidator.class);

    public void validate(Object o) throws ValidationException {
        LOG.info("Enter with " + o.getClass().getCanonicalName());

        String fieldName = getFieldName();
        String classification = (String) getFieldValue(fieldName, o);
        if (!ClassificationService.isValidClassification(classification)) {
            addFieldError(fieldName, o);
        }
    }

}
