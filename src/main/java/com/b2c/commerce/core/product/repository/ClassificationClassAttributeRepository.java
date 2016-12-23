package com.b2c.commerce.core.product.repository;


import com.b2c.commerce.core.product.entities.ClassificationClassAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repo class for classification attributes.
 */
public interface ClassificationClassAttributeRepository extends JpaRepository<ClassificationClassAttribute, Long> {
}
