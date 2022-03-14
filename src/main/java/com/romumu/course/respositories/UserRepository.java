package com.romumu.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romumu.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
