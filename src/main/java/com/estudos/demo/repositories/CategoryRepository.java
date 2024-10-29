package com.estudos.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
