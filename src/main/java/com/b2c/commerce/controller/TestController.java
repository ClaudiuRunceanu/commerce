package com.b2c.commerce.controller;

import com.b2c.commerce.core.product.entities.*;
import com.b2c.commerce.core.product.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller for test purpose.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private CurrencyRepository currencyRepository;
    private PriceRepository priceRepository;
    private CategoryRepository categoryRepository;
    private CatalogRepository catalogRepository;
    private ProductRepository productRepository;
    private WarehouseRepository warehouseRepository;
    private StockRepository stockRepository;

    @Autowired
    public TestController(CurrencyRepository currencyRepository, PriceRepository priceRepository, CategoryRepository categoryRepository, CatalogRepository catalogRepository, ProductRepository productRepository, WarehouseRepository warehouseRepository, StockRepository stockRepository) {
        this.currencyRepository = currencyRepository;
        this.priceRepository = priceRepository;
        this.categoryRepository = categoryRepository;
        this.catalogRepository = catalogRepository;
        this.productRepository = productRepository;
        this.warehouseRepository = warehouseRepository;
        this.stockRepository = stockRepository;
    }




    @RequestMapping(method = RequestMethod.GET, value = "/prices", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Price> showPrices() {

        return priceRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/categories", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Category> showCategories() {

        return categoryRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/catalogs", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Catalog> showCatalogs() {

        return catalogRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> showProducts() {

        return productRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/stocks", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Stock> showStocks() {

        return stockRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/warehouses", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Warehouse> showWarehouses() {

        return warehouseRepository.findAll();
    }
}
