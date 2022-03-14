package com.romumu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romumu.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
