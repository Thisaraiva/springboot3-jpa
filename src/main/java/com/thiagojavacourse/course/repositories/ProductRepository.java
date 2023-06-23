package com.thiagojavacourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagojavacourse.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	//o JPA já tem a implementação padrão para a interface
}
