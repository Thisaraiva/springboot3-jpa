package com.thiagojavacourse.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagojavacourse.course.entities.Order;
import com.thiagojavacourse.course.services.OrderService;

@RestController//anotation 
@RequestMapping(value = "/orders") // nome dado ao recurso /users
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	//endpoint criado para acessar os recursos de users
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){// retorna respostas de requisições web
		List<Order> list = service.findAll();		
		return ResponseEntity.ok().body(list);				
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
