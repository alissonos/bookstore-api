package com.oliveira.bookstore.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StandardError {
	
	private Long timestamp;
	private Integer status;
	private String error;
	
	public StandardError() {
		super();
	}
}
