package com.online.store.cs489.repository;

import com.online.store.cs489.domain.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
    @Query(value = "SELECT c FROM Category c")
    public List<Category> getAllCategories();
}
