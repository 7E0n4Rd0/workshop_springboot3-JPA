package com.projetowebservicesspringjpa.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservicesspringjpa.udemy.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
