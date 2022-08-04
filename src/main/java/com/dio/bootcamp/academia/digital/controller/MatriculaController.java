package com.dio.bootcamp.academia.digital.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.bootcamp.academia.digital.entity.Matricula;
import com.dio.bootcamp.academia.digital.service.MatriculaService;

@RestController
@RequestMapping(value = "/api")
public class MatriculaController {

	@Autowired
	private MatriculaService service;

	@GetMapping(path = "matricula")
	public List<Matricula> list() {
		return service.list();
	}

	@GetMapping(path = "matricula/{id}")
	public Optional<Matricula> getId(@PathVariable Long id) {
		return service.getId(id);
	}

	@PostMapping(path = "matricula")
	public Matricula create(@RequestBody Matricula matricula) {
		return service.create(matricula);
	}

	@PutMapping(path = "matricula")
	public Matricula update(@RequestBody Matricula matricula) {
		return service.update(matricula);
	}
	
	@DeleteMapping(path = "matricula/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
