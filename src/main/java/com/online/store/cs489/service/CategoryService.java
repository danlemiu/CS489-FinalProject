package com.online.store.cs489.service;

import com.online.store.cs489.domain.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getAllCategories();

    public Category getCategoryById(Integer id);
}
