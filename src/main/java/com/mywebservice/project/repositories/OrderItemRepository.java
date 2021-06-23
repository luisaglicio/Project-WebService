package com.mywebservice.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mywebservice.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
