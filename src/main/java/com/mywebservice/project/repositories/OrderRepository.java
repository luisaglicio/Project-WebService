package com.mywebservice.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mywebservice.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
