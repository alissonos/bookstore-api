package com.oliveira.bookstore.domain;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Livro implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "Campo TÍTULO é requerido")
	@Length(min = 3, max = 50, message = "O campo TÍTULO deve ter entre 3 e 50 caracteres")
	private String titulo;
	
	@NotEmpty(message = "Campo NOME DO AUTOR é requerido")
	@Length(min = 3, max = 50, message = "O campo NOME DO AUTOR deve ter entre 3 e 50 caracteres")
	@Column(name = "nome_autor")
	private String nomeAutor;
	
	@NotEmpty(message = "Campo TEXTO é requerido")
	@Length(min = 10, max = 2000000, message = "O campo NOME DO AUTOR deve ter entre 10 e 2.000.000 caracteres")
	private String texto;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "idcategoria")
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
