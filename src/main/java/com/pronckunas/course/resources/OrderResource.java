package com.pronckunas.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pronckunas.course.entities.Order;
import com.pronckunas.course.services.OrderService;

//informa que é um recurso Web implementado por um controlador Rest
@RestController 
@RequestMapping (value = "/orders")
public class OrderResource {

	@Autowired //permite injeção automatica
	private OrderService service;
	@GetMapping //define que o método responde a requisição do tipo GET do Http
	public ResponseEntity<List<Order>> findAll () {//Generics
		List<Order> list =  service.findAll();
		return ResponseEntity.ok().body(list); //retorna a resposta com sucesso(ok) e o corpo da respotas(body)
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
