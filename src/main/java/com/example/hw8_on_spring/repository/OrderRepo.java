package com.example.hw8_on_spring.repository;

import com.example.hw8_on_spring.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<OrderEntity, Long> {
}
