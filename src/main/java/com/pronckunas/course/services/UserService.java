package com.pronckunas.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pronckunas.course.entities.User;
import com.pronckunas.course.repositories.UserRepository;

@Service //permite registrar um serviço
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
	
	//operação para inserir um objeto user no BD
	public User insert(User obj) {
		return repository.save(obj);
	}
}
