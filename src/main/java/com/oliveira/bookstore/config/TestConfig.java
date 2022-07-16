package com.oliveira.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.oliveira.bookstore.service.DBservice;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBservice dbservice;
	
	@Bean
	public void instanciaBaseDeDados() {
		this.dbservice.instanciaBaseDeDados();
	}
}
