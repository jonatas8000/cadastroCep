package com.cadastroCep.cadastroCepApi.service.dto;

import java.time.Instant;

public class ExcecoesRetornoApiDTO extends MensagemRetornoApiDTO {
  
	private String descricaoExcecoes;
	
	public ExcecoesRetornoApiDTO(int codeStatus,String tituloStatus, String descricaoExcecoes) {
		super();
		setCodeStatus(codeStatus);
		setTituloStatus(tituloStatus);
		setDataHora(Instant.now());
		this.descricaoExcecoes=descricaoExcecoes;
	}
	
	public ExcecoesRetornoApiDTO() {
		super();
		
	}

	public String getDescricaoExcecoes() {
		return descricaoExcecoes;
	}

	public void setDescricaoExcecoes(String descricaoExcecoes) {
		this.descricaoExcecoes = descricaoExcecoes;
	}
	
	
}
