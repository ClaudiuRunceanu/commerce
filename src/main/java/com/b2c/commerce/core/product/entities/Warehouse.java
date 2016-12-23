package com.b2c.commerce.core.product.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Class for warehouse entity.
 */
@Entity
public class Warehouse {
    @Id
    @GeneratedValue
    private Long pk;
    private String name;
    private String address;
    private String consignments;

    protected Warehouse() {
        //jpa only
    }

    public Warehouse(String name, String address, String consignments) {
        this.name = name;
        this.address = address;
        this.consignments = consignments;
    }

    public Long getPk() {
        return pk;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getConsignments() {
        return consignments;
    }
}
