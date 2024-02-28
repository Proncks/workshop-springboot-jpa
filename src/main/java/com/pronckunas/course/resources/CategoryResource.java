package com.pronckunas.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pronckunas.course.entities.Category;
import com.pronckunas.course.services.CategoryService;

//informa que é um recurso Web implementado por um controlador Rest
@RestController 
@RequestMapping (value = "/categories")
public class CategoryResource {

	@Autowired //permite injeção automatica
	private CategoryService service;
	@GetMapping //define que o método responde a requisição do tipo GET do Http
	public ResponseEntity<List<Category>> findAll () {//Generics
		List<Category> list =  service.findAll();
		return ResponseEntity.ok().body(list); //retorna a resposta com sucesso(ok) e o corpo da respotas(body)
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
