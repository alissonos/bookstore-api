package com.oliveira.bookstore.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Categoria {
	
	@EqualsAndHashCode.Include
	private Integer id;
	
	private String nome;
	private String descricao;
	
	private List<Livro> livros = new ArrayList<>();

	public Categoria() {
		super();
	}

	public Categoria(Integer id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	
}
