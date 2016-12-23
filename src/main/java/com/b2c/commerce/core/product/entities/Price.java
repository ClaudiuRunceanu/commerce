package com.b2c.commerce.core.product.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Class for price entity
 */
@Entity
public class Price {

    @Id
    @GeneratedValue
    private Long pk;
    private Double priceValue;
    @ManyToOne
    private Currency currency;

    protected Price() {
        //jpa only
    }

    public Price(Double priceValue, Currency currency) {
        this.priceValue = priceValue;
        this.currency = currency;
    }

    public Long getPk() {
        return pk;
    }

    public Double getPriceValue() {
        return priceValue;
    }

    public Currency getCurrency() {
        return currency;
    }
}
