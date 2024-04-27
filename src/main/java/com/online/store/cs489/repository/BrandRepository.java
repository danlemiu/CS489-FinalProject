package com.online.store.cs489.repository;

import com.online.store.cs489.domain.Brand;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Integer> {
    @Query(value = "SELECT b FROM Brand b")
    public List<Brand> getAllBrands();
}
