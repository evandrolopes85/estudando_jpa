package com.aprendendo.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Evento {

	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	@ManyToMany(mappedBy = "eventos")
	private List<Pessoa> pessoas;
	
	public Evento() {
		// TODO Auto-generated constructor stub
	}

	public Evento(Long id, String nome, List<Pessoa> pessoas) {
		super();
		this.id = id;
		this.nome = nome;
		this.pessoas = pessoas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Pessoa> getPessoa() {
		return pessoas;
	}

	public void setPessoa(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
}
