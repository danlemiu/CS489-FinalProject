package com.online.store.cs489.advice;


import com.online.store.cs489.constant.ApplicationConstants;
import com.online.store.cs489.domain.Cart;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class ControllerExceptionAdvice {
    @ModelAttribute(ApplicationConstants.SESSION_ATTRIBUTES.SHOPPING_CART)
    public Cart shoppingCart() {
        return new Cart();
    }
}
