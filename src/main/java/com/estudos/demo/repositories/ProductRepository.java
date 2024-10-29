package com.estudos.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
