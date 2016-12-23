package com.b2c.commerce.core.product.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Class for category entity.
 */
@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long pk;
    private String name;
    private String description;
    @ManyToMany
    private List<Category> categories;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ClassificationClassAttribute> classificationClassAttributes;

    protected Category() {
        //jpa only
    }

    public Category(String name, String description, List<Category> categories, List<ClassificationClassAttribute> classificationClassAttributes) {
        this.name = name;
        this.description = description;
        this.categories = categories;
        this.classificationClassAttributes = classificationClassAttributes;
    }

    public List<ClassificationClassAttribute> getClassificationClassAttributes() {
        return classificationClassAttributes;
    }

    public Long getPk() {
        return pk;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
