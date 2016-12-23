package com.b2c.commerce.core.product.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Class for currency entity.
 */
@Entity
public class Currency {

    @Id
    @GeneratedValue
    private Long pk;
    private String code;
    private String name;
    private String symbol;

    protected Currency() {
        // jpa only
    }

    public Currency(String code, String name, String symbol) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }

    public Long getPk() {
        return pk;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }
}
