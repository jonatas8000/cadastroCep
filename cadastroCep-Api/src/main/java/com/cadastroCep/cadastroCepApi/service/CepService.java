package com.cadastroCep.cadastroCepApi.service;

import com.cadastroCep.cadastroCepApi.service.dto.CepDTO;

public interface CepService {

	public CepDTO salvar(CepDTO cepDTO);
	
	public CepDTO atualizar(CepDTO cepDTO);
	
	public void excluir(Long id);
}
