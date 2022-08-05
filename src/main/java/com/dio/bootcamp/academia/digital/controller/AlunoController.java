package com.dio.bootcamp.academia.digital.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.bootcamp.academia.digital.entity.Aluno;
import com.dio.bootcamp.academia.digital.service.AlunoService;

@RestController
@RequestMapping(value = "/api")
public class AlunoController {

	@Autowired
	private AlunoService service;

	@GetMapping(path = "alunos")
	public List<Aluno> list() {
		return service.list();
	}

	@GetMapping(path = "aluno/{id}")
	public Optional<Aluno> getId(@PathVariable Long id) {
		return service.getId(id);
	}

	@PostMapping(path = "aluno")
	public Aluno create(@Valid @RequestBody Aluno aluno) {
		return service.create(aluno);
	}

	@PutMapping(path = "aluno")
	public Aluno update(@Valid @RequestBody Aluno aluno) {
		return service.update(aluno);
	}
	
	@DeleteMapping(path = "aluno/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
