package com.b2c.commerce.core.product.repository;

import com.b2c.commerce.core.product.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repo class for stock entity.
 */
public interface StockRepository extends JpaRepository<Stock,Long> {
}
