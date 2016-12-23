package com.b2c.commerce.core.product.repository;

import com.b2c.commerce.core.product.entities.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repo class for currency.
 */
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
