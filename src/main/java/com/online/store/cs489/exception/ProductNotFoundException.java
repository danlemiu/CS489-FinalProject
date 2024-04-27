package com.online.store.cs489.exception;

public class ProductNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 3935230281455340039L;

    private Long productId;

    public ProductNotFoundException(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }

}
