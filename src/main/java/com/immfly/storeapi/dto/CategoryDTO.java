package com.immfly.storeapi.dto;

import jakarta.validation.constraints.NotBlank;

public class CategoryDTO {

    private Long id;

    @NotBlank(message = "Category name must not be blank")
    private String name;

    private Long parentCategoryId;

    public CategoryDTO() {
    }

    public CategoryDTO(Long id, String name, Long parentCategoryId) {
        this.id = id;
        this.name = name;
        this.parentCategoryId = parentCategoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }
}
