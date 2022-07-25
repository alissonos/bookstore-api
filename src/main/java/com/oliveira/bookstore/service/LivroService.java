package com.oliveira.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oliveira.bookstore.domain.Livro;
import com.oliveira.bookstore.repositories.LivroRepository;
import com.oliveira.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class LivroService {
		
	@Autowired
	private LivroRepository livroRepository;
	
	public Livro findById(Integer id) {
		Optional<Livro> obj = livroRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id + ", tipo: " + Livro.class.getName()));
	}
	
}
