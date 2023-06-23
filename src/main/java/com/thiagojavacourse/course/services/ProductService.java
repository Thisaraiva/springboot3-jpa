package com.thiagojavacourse.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagojavacourse.course.entities.Product;
import com.thiagojavacourse.course.repositories.ProductRepository;

@Service //anotation "component" que já registra sua classe como um componente do spring e ela já poderá ser injetada com o @Autowired, mas como é uma classe de serviço usaremos o anotation @Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id); 
		return obj.get(); 
	}

}
