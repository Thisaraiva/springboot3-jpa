package com.thiagojavacourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagojavacourse.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	//o JPA já tem a implementação padrão para a interface
}
