package com.projetowebservicesspringjpa.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservicesspringjpa.udemy.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
