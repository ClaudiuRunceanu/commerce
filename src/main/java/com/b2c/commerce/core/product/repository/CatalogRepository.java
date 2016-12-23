package com.b2c.commerce.core.product.repository;

import com.b2c.commerce.core.product.entities.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repo class for catalog entity.
 */
public interface CatalogRepository extends JpaRepository<Catalog, Long> {
}
