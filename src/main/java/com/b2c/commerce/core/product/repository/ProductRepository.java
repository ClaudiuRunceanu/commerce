package com.b2c.commerce.core.product.repository;

import com.b2c.commerce.core.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repo class for product.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
