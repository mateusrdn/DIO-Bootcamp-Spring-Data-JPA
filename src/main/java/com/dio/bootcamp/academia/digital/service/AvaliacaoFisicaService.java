package com.dio.bootcamp.academia.digital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.bootcamp.academia.digital.entity.AvaliacaoFisica;
import com.dio.bootcamp.academia.digital.repository.AvaliacaoFisicaRepository;

@Service
public class AvaliacaoFisicaService {

	@Autowired
	private AvaliacaoFisicaRepository repository;
	
	public List<AvaliacaoFisica> list() {
		return (List<AvaliacaoFisica>) repository.findAll();
	}
	
	public Optional<AvaliacaoFisica> getId(Long id) {
		return repository.findById(id);
	}
	
	public AvaliacaoFisica create(AvaliacaoFisica avalicao) {
		return repository.save(avalicao);
	}
	
	public AvaliacaoFisica update(AvaliacaoFisica avaliacao) {
		return repository.save(avaliacao);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
