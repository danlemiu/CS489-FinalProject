package com.online.store.cs489.controller;

import com.online.store.cs489.constant.ApplicationConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/cart")
@SessionAttributes(ApplicationConstants.SESSION_ATTRIBUTES.SHOPPING_CART)
public class CartController {

    @RequestMapping
    public String getCart(Model model) {
        return "cart";
    }
}