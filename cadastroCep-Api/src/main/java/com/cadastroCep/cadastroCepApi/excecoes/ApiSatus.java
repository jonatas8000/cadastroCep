package com.cadastroCep.cadastroCepApi.excecoes;

import org.springframework.http.HttpStatus;

public enum ApiSatus {

	
	DADO_INVALIDO(HttpStatus.BAD_REQUEST,"Dado inválido","");
	
	public final HttpStatus httpStatus;
	public final String message;
	public final String description;
	
	private ApiSatus(HttpStatus httpStatus, String message, String description) {
		this.httpStatus = httpStatus;
		this.message = message;
		this.description = description;
	}
	
	public int toInt() {
		return httpStatus.value();
	}
	
	
}
