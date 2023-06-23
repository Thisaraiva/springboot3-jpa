package com.thiagojavacourse.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagojavacourse.course.entities.Product;
import com.thiagojavacourse.course.services.ProductService;

@RestController//anotation 
@RequestMapping(value = "/products") // nome dado ao recurso /users
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	//endpoint criado para acessar os recursos de users
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){// retorna respostas de requisições web
		List<Product> list = service.findAll();		
		return ResponseEntity.ok().body(list);				
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
