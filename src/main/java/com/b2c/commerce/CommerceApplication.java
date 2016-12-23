package com.b2c.commerce;

import com.b2c.commerce.core.product.entities.*;
import com.b2c.commerce.core.product.repository.*;
import org.apache.tomcat.util.modeler.Util;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class CommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner init(PriceRepository priceRepository,
                           CurrencyRepository currencyRepository, CategoryRepository categoryRepository, CatalogRepository catalogRepository, ProductRepository productRepository, WarehouseRepository warehouseRepository) {

        return (evt) -> {
            productRepository.deleteAll();
            priceRepository.deleteAll();
            currencyRepository.deleteAll();
            categoryRepository.deleteAll();
            catalogRepository.deleteAll();
            warehouseRepository.deleteAll();


            Currency eur = new Currency("eur", "eur", "e");
            currencyRepository.save(eur);
            priceRepository.save(new Price(15.2, eur));
            priceRepository.save(new Price(23.4, eur));

            ClassificationClassAttribute latime=new ClassificationClassAttribute("atribute ptr latime","latime", ClassificationAttributeType.STRING);
            ClassificationClassAttribute lungime=new ClassificationClassAttribute("atribute ptr lungime","lungime", ClassificationAttributeType.STRING);
            List<ClassificationClassAttribute> classificationClassAttributes= new ArrayList<>();
            classificationClassAttributes.add(latime);
            classificationClassAttributes.add(lungime);

            Category electronice = new Category("electronice", "description", null, null);
            categoryRepository.save(electronice);
            List<Category> categories = new ArrayList<>();
            categories.add(electronice);
            categoryRepository.save(new Category("TV", "description", categories,null));

            electronice.setDescription("new description");
            categoryRepository.save(electronice);

            Catalog online = new Catalog("electronics", CatalogVersion.ONLINE, true);
            Catalog stage = new Catalog("electronics", CatalogVersion.STAGE, false);
            catalogRepository.save(online);
            catalogRepository.save(stage);

            Warehouse warehouse= new Warehouse("testWarehouse","testAddress","testConsignments");
            warehouseRepository.save(warehouse);

            List<Stock> stocks= new ArrayList<>();
            stocks.add(new Stock(2,0,0,new Date(),new Date(),warehouse));

            List<Category> productCategories = new ArrayList<>();
            productCategories.add(new Category("testProducts", "category for test purpose", null,classificationClassAttributes));
          //  productCategories.add(electronice);
            List<Price> productPrices = new ArrayList<>();
            productPrices.add(new Price(17.2, eur));
            productPrices.add(new Price(18.2, eur));
            Product test = new Product("product1", "product1", stage, productCategories, productPrices,stocks);
            productRepository.save(test);


            productRepository.delete(test);
        };

    }
}
