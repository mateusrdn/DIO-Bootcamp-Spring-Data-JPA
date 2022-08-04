package com.dio.bootcamp.academia.digital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.bootcamp.academia.digital.entity.Matricula;
import com.dio.bootcamp.academia.digital.repository.MatriculaRepository;

@Service
public class MatriculaService {


	@Autowired
	private MatriculaRepository repository;
	
	public List<Matricula> list() {
		return (List<Matricula>) repository.findAll();
	}
	
	public Optional<Matricula> getId(Long id) {
		return repository.findById(id);
	}
	
	public Matricula create(Matricula matricula) {
		return repository.save(matricula);
	}
	
	public Matricula update(Matricula matricula) {
		return repository.save(matricula);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
