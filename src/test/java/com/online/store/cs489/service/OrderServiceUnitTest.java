package com.online.store.cs489.service;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

        import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.online.store.cs489.domain.Order;
import com.online.store.cs489.repository.OrderRepository;
import com.online.store.cs489.service.impl.OrderServiceImpl;
import org.aspectj.weaver.ast.Or;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class OrderServiceUnitTest {
    OrderService orderService = new OrderServiceImpl();

    @Test
    public void testexchangeToEqualPoints() {

        double price = 860;
        int expectedPoints = 860;
        int actualPoints = orderService.exchangeToEqualPoints(price);
        Assert.assertEquals(actualPoints, expectedPoints);
    }

    @Test
    public void testexchangeToAccumulatedPoints() {

        double subTotal = 860;
        int expectedPoints = 86;
        int actualPoints = orderService.exchangeToAccumulatedPoints(subTotal);
        Assert.assertEquals(actualPoints, expectedPoints);
    }

}
