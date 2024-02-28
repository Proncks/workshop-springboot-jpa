package com.pronckunas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pronckunas.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
