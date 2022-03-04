package com.example.hw8_on_spring.service;

import com.example.hw8_on_spring.entity.OrderEntity;
import com.example.hw8_on_spring.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepo productRepo;

    public OrderEntity registration(OrderEntity product)  {
        return productRepo.save(product);
    }

    public List<OrderEntity> getAllOrders()  {
        List<OrderEntity> ordersList = new ArrayList<OrderEntity>();
        productRepo.findAll().forEach(ordersList::add);
        return ordersList;
    }
}
