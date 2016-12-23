package com.b2c.commerce.core.product.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Class for product entity.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long pk;
    private String code;
    private String name;
    @ManyToOne
    private Catalog catalog;
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Category> categories;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Price> prices;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Stock> stocks;

    public Product() {
      //jpa only
    }

    public Product(String code, String name, Catalog catalog, List<Category> categories, List<Price> prices, List<Stock> stocks) {
        this.code = code;
        this.name = name;
        this.catalog = catalog;
        this.categories = categories;
        this.prices = prices;
        this.stocks = stocks;
    }

    public List<Stock> getStocks() {
        return stocks;
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

    public Catalog getCatalog() {
        return catalog;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
}
