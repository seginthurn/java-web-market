package com.devinhouse.javawebmarket.model.transport;

import com.devinhouse.javawebmarket.model.persistence.Category;

public class CategoryDTO {

    private String name;

    public CategoryDTO() {
    }

    public CategoryDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category generatePersistence(){
        return new Category(this.name);
    }
}
