package com.thiagojavacourse.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagojavacourse.course.entities.Category;
import com.thiagojavacourse.course.repositories.CategoryRepository;

@Service //anotation "component" que já registra sua classe como um componente do spring e ela já poderá ser injetada com o @Autowired, mas como é uma classe de serviço usaremos o anotation @Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id); 
		return obj.get(); 
	}

}
