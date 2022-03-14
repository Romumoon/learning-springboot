package com.romumu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romumu.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
