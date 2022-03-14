package com.romumu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romumu.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
