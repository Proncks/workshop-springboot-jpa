package com.pronckunas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pronckunas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
