package com.thiagojavacourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagojavacourse.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	//o JPA já tem a implementação padrão para a interface
}
