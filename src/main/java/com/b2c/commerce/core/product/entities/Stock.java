package com.b2c.commerce.core.product.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Class for entity stock.
 */
@Entity
public class Stock {
    @Id
    @GeneratedValue
    private Long pk;
    private int available;
    private int preOrder;
    private int reserved;
    private Date expireDate;
    private Date creationDate;
    @ManyToOne
    private Warehouse warehouse;

    protected Stock() {
      //jpa only
    }

    public Stock(int available, int preOrder, int reserved, Date expireDate, Date creationDate, Warehouse warehouse) {
        this.available = available;
        this.preOrder = preOrder;
        this.reserved = reserved;
        this.expireDate = expireDate;
        this.creationDate = creationDate;
        this.warehouse = warehouse;
    }

    public Long getPk() {
        return pk;
    }

    public int getAvailable() {
        return available;
    }

    public int getPreOrder() {
        return preOrder;
    }

    public int getReserved() {
        return reserved;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }
}
