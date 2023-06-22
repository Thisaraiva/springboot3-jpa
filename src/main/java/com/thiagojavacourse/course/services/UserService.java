package com.thiagojavacourse.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagojavacourse.course.entities.User;
import com.thiagojavacourse.course.repositories.UserRepository;

@Service //anotation "component" que já registra sua classe como um componente do spring e ela já poderá ser injetada com o @Autowired, mas como é uma classe de serviço usaremos o anotation @Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id); 
		return obj.get(); 
	}

}
