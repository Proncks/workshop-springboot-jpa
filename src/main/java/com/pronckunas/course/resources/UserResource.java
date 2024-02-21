package com.pronckunas.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pronckunas.course.entities.User;

//informa que é um recurso Web implementado por um controlador Rest
@RestController 
@RequestMapping (value = "/users")
public class UserResource {

	@GetMapping //define que o método responde a requisição do tipo GET do Http
	public ResponseEntity<User> findAll () {//Generics
		User u = new User(1L, "Maria", "maria@gmail.com", "999999", "12345");
		return ResponseEntity.ok().body(u); //retorna a resposta com sucesso(ok) e o corpo da respotas(body)
	}
}
