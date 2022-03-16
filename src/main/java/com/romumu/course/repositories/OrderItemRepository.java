package com.romumu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romumu.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
