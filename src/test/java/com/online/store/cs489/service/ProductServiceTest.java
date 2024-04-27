package com.online.store.cs489.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Optional;

import com.online.store.cs489.domain.Product;
import com.online.store.cs489.repository.ProductRepository;
import com.online.store.cs489.service.impl.ProductServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService = new ProductServiceImpl();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveProduct() {
        Product product = new Product(1L, "Product 1", 10.0);
        when(productRepository.save(product)).thenReturn(product);
        Product savedProduct = productService.save(product);
        assertEquals(product, savedProduct);
    }

    @Test
    public void testGetProductById() {
        Product product = new Product(4L, "Product 4", 10.0);
        when(productRepository.findById(4L)).thenReturn(Optional.of(product));
        Product retrievedProduct = productService.getProductById(4L);
        assertEquals(product, retrievedProduct);
    }
}
