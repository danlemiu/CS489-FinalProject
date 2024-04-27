package com.online.store.cs489.service;

import com.online.store.cs489.domain.Brand;

import java.util.List;

public interface BrandService {
    public List<Brand> getAllBrands();

    public Brand getBrandById(Integer id);
}
