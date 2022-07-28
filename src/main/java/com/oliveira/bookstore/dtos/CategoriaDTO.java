package com.oliveira.bookstore.dtos;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import com.oliveira.bookstore.domain.Categoria;

import jakarta.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class CategoriaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	
	@NotEmpty(message = "Campo NOME é requerido")
	@Length(min = 3, max = 100, message = "O campo NOME deve ter entre 3 e 100 caracteres")
	private String nome;
	
	@NotEmpty(message = "Campo DESCRIÇÃO é requerido")
	@Length(min = 3, max = 200, message = "O campo DESCRIÇÃO deve ter entre 3 e 200 caracteres")
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
