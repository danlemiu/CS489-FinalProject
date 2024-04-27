package com.online.store.cs489.controller;

import com.online.store.cs489.constant.ApplicationConstants;
import com.online.store.cs489.domain.Product;
import com.online.store.cs489.domain.User;
import com.online.store.cs489.dto.Response;
import com.online.store.cs489.exception.ProductNotFoundException;
import com.online.store.cs489.service.ProductService;
import com.online.store.cs489.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes(ApplicationConstants.SESSION_ATTRIBUTES.SHOPPING_CART)
public class ProductDetailsController {
    @Autowired
    private UserService userService;

    @Autowired
    private  ProductService productService;

    @GetMapping("/product-details/{pid}")
    public  String details(@PathVariable Long pid, Model model){


        model.addAttribute("productId", pid);

        //For current user logged in
        model.addAttribute("currentUser", userService.getCurrentUser());


        Product product = productService.getProductById(pid);
        model.addAttribute(product);
        return "product-details";
    }

    @RequestMapping(value = "/rest/follow/{seller_id}", method = RequestMethod.PUT)
    public @ResponseBody
    Response followSeller(@PathVariable("seller_id") Long sellerId, HttpServletRequest request, Model model) {
        User user = userService.findUserById(sellerId);
        if (user == null) {
            throw new IllegalArgumentException(new ProductNotFoundException(sellerId));
        }
        user.addFollower(userService.getCurrentUser());
        userService.save(user);
        return new Response(true);
    }
    @RequestMapping(value = "/rest/unfollow/{seller_id}", method = RequestMethod.PUT)
    public @ResponseBody
    Response unfollowSeller(@PathVariable("seller_id") Long sellerId, HttpServletRequest request, Model model) {
        User user = userService.findUserById(sellerId);
        if (user == null) {
            throw new IllegalArgumentException(new ProductNotFoundException(sellerId));
        }
        user.removeFollower(userService.getCurrentUser());
        userService.save(user);
        return new Response(true);
    }
}
