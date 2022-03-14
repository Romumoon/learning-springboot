package com.romumu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romumu.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
