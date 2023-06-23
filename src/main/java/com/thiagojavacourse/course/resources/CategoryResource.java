package com.thiagojavacourse.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagojavacourse.course.entities.Category;
import com.thiagojavacourse.course.services.CategoryService;

@RestController//anotation 
@RequestMapping(value = "/categories") // nome dado ao recurso /users
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	//endpoint criado para acessar os recursos de users
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){// retorna respostas de requisições web
		List<Category> list = service.findAll();		
		return ResponseEntity.ok().body(list);				
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
