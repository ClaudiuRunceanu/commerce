package com.b2c.commerce.core.product.entities;

/**
 * Enum for catalog type
 */
public enum CatalogVersion {
    ONLINE("online"), STAGE("stage");

    private String name;

    CatalogVersion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
