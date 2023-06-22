package com.thiagojavacourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagojavacourse.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	//o JPA já tem a implementação padrão para a interface
}
