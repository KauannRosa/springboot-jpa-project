package com.estudos.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
