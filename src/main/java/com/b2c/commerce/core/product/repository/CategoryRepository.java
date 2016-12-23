package com.b2c.commerce.core.product.repository;

import com.b2c.commerce.core.product.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repo class for category.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
