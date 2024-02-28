package com.pronckunas.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pronckunas.course.entities.User;
import com.pronckunas.course.services.UserService;

//informa que é um recurso Web implementado por um controlador Rest
@RestController 
@RequestMapping (value = "/users")
public class UserResource {

	@Autowired //permite injeção automatica
	private UserService service;
	@GetMapping //define que o método responde a requisição do tipo GET do Http
	public ResponseEntity<List<User>> findAll () {//Generics
		List<User> list =  service.findAll();
		return ResponseEntity.ok().body(list); //retorna a resposta com sucesso(ok) e o corpo da respotas(body)
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
