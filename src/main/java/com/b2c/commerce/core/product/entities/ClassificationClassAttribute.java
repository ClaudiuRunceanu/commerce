package com.b2c.commerce.core.product.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Class for classification attribute entity.
 */
@Entity
public class ClassificationClassAttribute {
    @Id
    @GeneratedValue
    private Long pk;
    private String description;
    private String attributeName;
    private ClassificationAttributeType classificationAttributeType;

    protected ClassificationClassAttribute() {
        //jpa only
    }

    public ClassificationClassAttribute(String description, String attributeName, ClassificationAttributeType classificationAttributeType) {
        this.description = description;
        this.attributeName = attributeName;
        this.classificationAttributeType = classificationAttributeType;
    }

    public Long getPk() {
        return pk;
    }

    public String getDescription() {
        return description;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public ClassificationAttributeType getClassificationAttributeType() {
        return classificationAttributeType;
    }
}
