package com.estudos.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
