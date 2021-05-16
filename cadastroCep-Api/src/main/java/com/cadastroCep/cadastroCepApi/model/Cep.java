package com.cadastroCep.cadastroCepApi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Cep {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@NotNull
	private Long faixaInicio;
	@NotNull
	private Long faixaFim;
	@NotNull
	@OneToOne
	@JoinColumn(name="CODIGO_LOJA")
	private Loja loja;
	
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
	public Loja getLoja() {
		return loja;
	}
	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	
	
}
