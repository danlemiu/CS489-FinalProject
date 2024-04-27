package com.online.store.cs489.helper;

import com.online.store.cs489.constant.ApplicationConstants;
import com.online.store.cs489.domain.Cart;
import org.springframework.ui.Model;

public class SessionAttributeHelper {
    public static Cart getCartFromModel(Model model){
        return (Cart) model.asMap().get(ApplicationConstants.SESSION_ATTRIBUTES.SHOPPING_CART);
    }
    public static void setCartToModel(Cart cart, Model model){

        model.addAttribute(ApplicationConstants.SESSION_ATTRIBUTES.SHOPPING_CART, cart);
    }
}
