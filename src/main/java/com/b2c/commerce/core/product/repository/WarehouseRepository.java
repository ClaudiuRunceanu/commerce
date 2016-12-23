package com.b2c.commerce.core.product.repository;

import com.b2c.commerce.core.product.entities.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repo class for warehouse entity.
 */
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
