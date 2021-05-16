package com.cadastroCep.cadastroCepApi.service.dto;

import java.time.Instant;

public class MensagemRetornoApiDTO {

	private int codeStatus;
	private String tituloStatus;
	private Instant dataHora;
	
	public int getCodeStatus() {
		return codeStatus;
	}
	public void setCodeStatus(int codeStatus) {
		this.codeStatus = codeStatus;
	}
	public String getTituloStatus() {
		return tituloStatus;
	}
	public void setTituloStatus(String tituloStatus) {
		this.tituloStatus = tituloStatus;
	}
	public Instant getDataHora() {
		return dataHora;
	}
	public void setDataHora(Instant dataHora) {
		this.dataHora = dataHora;
	}
	
	
}
