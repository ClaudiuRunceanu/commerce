package com.b2c.commerce.core.product.repository;

import com.b2c.commerce.core.product.entities.Price;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repo class for price.
 */
public interface PriceRepository extends JpaRepository<Price, Long> {
}
