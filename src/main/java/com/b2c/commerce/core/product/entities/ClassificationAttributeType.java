package com.b2c.commerce.core.product.entities;

/**
 * Enum used to represent type for classification attributes.
 */
public enum ClassificationAttributeType {
    STRING("string"), DOUBLE("double"), BOOLEAN("boolean"), RANGE("range"), DATE("date");
    private String name;

    ClassificationAttributeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
