package com.projetowebservicesspringjpa.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservicesspringjpa.udemy.entities.OrderItem;
import com.projetowebservicesspringjpa.udemy.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
