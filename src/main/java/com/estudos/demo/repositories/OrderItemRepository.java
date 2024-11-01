package com.estudos.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
