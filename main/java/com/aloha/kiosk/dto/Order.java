package com.aloha.kiosk.dto;

import java.util.List;

public class Order {
    private int id;
    private String paymentMethod;
    private int totalAmount;
    private List<OrderItem> items;

    // getters and setters
}