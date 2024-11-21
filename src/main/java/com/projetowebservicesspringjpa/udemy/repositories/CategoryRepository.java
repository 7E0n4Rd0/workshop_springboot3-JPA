package com.projetowebservicesspringjpa.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservicesspringjpa.udemy.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
