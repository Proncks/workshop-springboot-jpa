package com.pronckunas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pronckunas.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
