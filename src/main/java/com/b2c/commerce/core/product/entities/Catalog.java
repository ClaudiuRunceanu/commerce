package com.b2c.commerce.core.product.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 * Class for catalog entity
 */
@Entity
public class Catalog {
    @Id
    @GeneratedValue
    private Long pk;
    private String name;
    private CatalogVersion version;
    private Boolean defaultCatalog;

    protected Catalog() {
        //jpa only
    }

    public Catalog(String name, CatalogVersion version, Boolean defaultCatalog) {
        this.name = name;
        this.version = version;
        this.defaultCatalog = defaultCatalog;
    }

    public Long getPk() {
        return pk;
    }

    public String getName() {
        return name;
    }

    public CatalogVersion getVersion() {
        return version;
    }

    public Boolean getDefaultCatalog() {
        return defaultCatalog;
    }
}
