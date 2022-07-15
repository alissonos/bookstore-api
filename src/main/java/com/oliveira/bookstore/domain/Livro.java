package com.oliveira.bookstore.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Livro {
	
	@EqualsAndHashCode.Include
	private Integer id;
	
	private String titulo;
	private String nomeAutor;
	private String texto;
	
	private Categoria categoria;

	public Livro() {
		super();
	}

	public Livro(Integer id, String titulo, String nomeAutor, String texto, Categoria categoria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.nomeAutor = nomeAutor;
		this.texto = texto;
		this.categoria = categoria;
	}
	
	
	
	
}
