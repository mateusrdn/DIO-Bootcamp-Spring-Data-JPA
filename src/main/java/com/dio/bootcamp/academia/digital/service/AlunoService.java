package com.dio.bootcamp.academia.digital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.bootcamp.academia.digital.entity.Aluno;
import com.dio.bootcamp.academia.digital.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository repository;
	
	public List<Aluno> list() {
		return (List<Aluno>) repository.findAll();
	}
	
	public Optional<Aluno> getId(Long id) {
		return repository.findById(id);
	}
	
	public Aluno create(Aluno aluno) {
		return repository.save(aluno);
	}
	
	public Aluno update(Aluno aluno) {
		return repository.save(aluno);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
