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

import com.dio.bootcamp.academia.digital.entity.AvaliacaoFisica;
import com.dio.bootcamp.academia.digital.service.AvaliacaoFisicaService;

@RestController
@RequestMapping(value = "/api")
public class AvaliacaoFisicaController {

	@Autowired
	private AvaliacaoFisicaService service;

	@GetMapping(path = "avaliacao")
	public List<AvaliacaoFisica> list() {
		return service.list();
	}

	@GetMapping(path = "avaliacao/{id}")
	public Optional<AvaliacaoFisica> getId(@PathVariable Long id) {
		return service.getId(id);
	}

	@PostMapping(path = "avaliacao")
	public AvaliacaoFisica create(@RequestBody AvaliacaoFisica avalicao) {
		return service.create(avalicao);
	}

	@PutMapping(path = "avaliacao")
	public AvaliacaoFisica update(@RequestBody AvaliacaoFisica avalicao) {
		return service.update(avalicao);
	}
	
	@DeleteMapping(path = "avaliacao/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
}
