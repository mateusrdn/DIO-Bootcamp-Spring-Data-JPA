package com.dio.bootcamp.academia.digital.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "alunos")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Preencha o campo corretamente")
	@Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres")
	private String nome;
	
	@Column(unique = true)
	@NotBlank(message = "Preencha o campo corretamente")
	@CPF(message = "'${validatedValue}' é invalido")
	private String cpf;
	
	@NotBlank(message = "Preencha o campo corretamente")
	@Size(min = 3, max = 50, message = "'${validatedValue}' precisa entar entre {min} e {max} caracteres.")
	private String bairro;
	
	@NotNull(message = "Preencha o campo corretamente")
	@Past(message = "Data '${validatedValue}' é invalida")
	private LocalDate dataDeNascimento;
	
	@OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}
