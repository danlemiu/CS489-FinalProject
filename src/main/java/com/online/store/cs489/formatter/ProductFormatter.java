package com.online.store.cs489.formatter;

import com.online.store.cs489.domain.Product;
import com.online.store.cs489.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class ProductFormatter implements Formatter<Product> {

    @Autowired
    private ProductService productService;

    //    @Override
    public String print(Product product, Locale locale) {
        return String.valueOf(product.getId());
    }

    //    @Override
    public Product parse(String text, Locale locale) throws ParseException {
        System.out.println(text + "------");
        return productService.getProductById(Long.parseLong(text));
    }

}