package com.online.store.cs489.service;

import com.online.store.cs489.domain.*;
import com.online.store.cs489.dto.Response;

import java.io.ByteArrayInputStream;
import java.util.List;

public interface OrderService {

    Order save(Order order);

    OrderStatus getStatusByName(OrderStatusType status);

    List<Payment> getAllPayments();

    List<Order> getAllOrders();

    Payment getPaymentById(int id);

    List<Order> getAllOrdersByUser(Long userId);

    Order getOrderById(Long id);

    Order cancelOrder(Long orderId);

    Response updateOrderStatus(Long orderId, String status);

    int getPointsOfUser(Long userId);

    int exchangeToAccumulatedPoints(double subTotal);

    int exchangeToEqualPoints(double price);

    void checkout(Order order, Cart cart, User user);

    public ByteArrayInputStream createReport(Order order);
}
