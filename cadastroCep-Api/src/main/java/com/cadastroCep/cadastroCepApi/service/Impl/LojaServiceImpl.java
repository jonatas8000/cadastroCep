package com.cadastroCep.cadastroCepApi.service.Impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastroCep.cadastroCepApi.excecoes.ExececaoRegraNegocio;
import com.cadastroCep.cadastroCepApi.model.Loja;
import com.cadastroCep.cadastroCepApi.repository.LojaRepository;
import com.cadastroCep.cadastroCepApi.service.LojaService;
import com.cadastroCep.cadastroCepApi.service.dto.LojaDTO;
import com.cadastroCep.cadastroCepApi.service.mapper.LojaMapper;

@Transactional
@Service
public class LojaServiceImpl  implements LojaService{

	@Autowired
	private LojaRepository lojaRepository;
	@Autowired
	private LojaMapper lojaMapper;
	
	@Override
	public LojaDTO salvar(LojaDTO lojaDTO) {
		if(lojaDTO.getNome()==null)
			throw new ExececaoRegraNegocio("Informar o nome da loja");
			
		return lojaMapper.toDto(lojaRepository.save(lojaMapper.toEntity(lojaDTO)));
	}

	@Override
	public LojaDTO buscarLojaPorCep(Long cep) {
		if(cep==null)
			throw new ExececaoRegraNegocio("Informar o cep");
		Optional<Loja> lojaOp= lojaRepository.buscarLojaPorCep(cep);
		
		if(lojaOp.isEmpty())
			throw new ExececaoRegraNegocio("Nenhuma loja encontrada");
		return lojaMapper.toDto(lojaOp.get());
	}

	
}
