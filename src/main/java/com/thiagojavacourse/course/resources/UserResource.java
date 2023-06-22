package com.thiagojavacourse.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagojavacourse.course.entities.User;

@RestController//anotation 
@RequestMapping(value = "/users") // nome dado ao recurso /users
public class UserResource {
	
	//endpoint criado para acessar os recursos de users
	@GetMapping
	public ResponseEntity<User> findAll(){// retorna respostas de requisições web
		User u = new User(1L, "Thiago", "thiago@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
				
	}

}
