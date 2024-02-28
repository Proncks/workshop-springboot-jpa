package com.pronckunas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pronckunas.course.entities.OrderItem;
import com.pronckunas.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
