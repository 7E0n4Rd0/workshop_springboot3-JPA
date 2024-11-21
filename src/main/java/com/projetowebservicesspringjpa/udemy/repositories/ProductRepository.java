package com.projetowebservicesspringjpa.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservicesspringjpa.udemy.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
