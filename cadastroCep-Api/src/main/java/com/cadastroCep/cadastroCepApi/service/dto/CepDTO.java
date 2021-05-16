package com.cadastroCep.cadastroCepApi.service.dto;

public class CepDTO {

	 private Long id;
	 private Long faixaInicio;
	 private Long faixaFim;
	 private LojaDTO lojaDTO;
	
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFaixaInicio() {
		return faixaInicio;
	}
	public void setFaixaInicio(Long faixaInicio) {
		this.faixaInicio = faixaInicio;
	}
	public Long getFaixaFim() {
		return faixaFim;
	}
	public void setFaixaFim(Long faixaFim) {
		this.faixaFim = faixaFim;
	}
	public LojaDTO getLojaDTO() {
		return lojaDTO;
	}
	public void setLojaDTO(LojaDTO lojaDTO) {
		this.lojaDTO = lojaDTO;
	}
	 
	 
}
