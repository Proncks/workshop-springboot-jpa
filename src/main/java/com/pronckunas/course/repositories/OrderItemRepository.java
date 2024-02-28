package com.pronckunas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pronckunas.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
