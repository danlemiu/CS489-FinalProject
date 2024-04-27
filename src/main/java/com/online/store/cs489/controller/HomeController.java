package com.online.store.cs489.controller;

import com.online.store.cs489.constant.ApplicationConstants;
import com.online.store.cs489.service.EmailService;
import com.online.store.cs489.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(ApplicationConstants.SESSION_ATTRIBUTES.SHOPPING_CART)
public class HomeController {

    @Autowired
    ProductService productService;

    @Autowired
    ResourceLoader resourceLoader;


    @Autowired
    EmailService emailService;


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", productService.findTopProduct());
        return "index";
    }

}
