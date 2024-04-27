package com.online.store.cs489.controller;

import com.online.store.cs489.domain.Review;
import com.online.store.cs489.dto.Response;
import com.online.store.cs489.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product/review/{pid}")
    public Response reviewAproduct(Principal principal, @PathVariable Long pid, @RequestBody Review review) {
        return productService.review(principal.getName(), pid, review);
    }
}
