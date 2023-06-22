package com.thiagojavacourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagojavacourse.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	//o JPA já tem a implementação padrão para a interface
}
