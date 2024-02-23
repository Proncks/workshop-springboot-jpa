package com.pronckunas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pronckunas.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
