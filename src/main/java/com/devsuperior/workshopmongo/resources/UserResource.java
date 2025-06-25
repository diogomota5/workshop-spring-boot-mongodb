package com.devsuperior.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.workshopmongo.domain.User;
import com.devsuperior.workshopmongo.services.UserService;

@RestController //Controlador Rest
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired // Acesso ao serviço
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List <User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
