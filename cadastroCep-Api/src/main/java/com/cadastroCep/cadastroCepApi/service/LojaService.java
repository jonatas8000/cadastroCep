package com.cadastroCep.cadastroCepApi.service;

import com.cadastroCep.cadastroCepApi.service.dto.LojaDTO;

public interface LojaService {

	public LojaDTO salvar(LojaDTO lojaDTO);
	
	public LojaDTO buscarLojaPorCep(Long cep);
}
