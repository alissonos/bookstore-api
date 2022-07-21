package com.oliveira.bookstore.dtos;

import java.io.Serializable;

import com.oliveira.bookstore.domain.Categoria;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class CategoriaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	
	private String nome;
	private String descricao;
	
	
	public CategoriaDTO() {
		super();
	}
	
	public CategoriaDTO(Categoria obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
	}



	
	
}
