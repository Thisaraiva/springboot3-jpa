package com.thiagojavacourse.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagojavacourse.course.entities.User;
import com.thiagojavacourse.course.services.UserService;

@RestController//anotation 
@RequestMapping(value = "/users") // nome dado ao recurso /users
public class UserResource {
	
	@Autowired
	private UserService service;
	
	//endpoint criado para acessar os recursos de users
	@GetMapping
	public ResponseEntity<List<User>> findAll(){// retorna respostas de requisições web
		List<User> list = service.findAll();		
		return ResponseEntity.ok().body(list);				
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
