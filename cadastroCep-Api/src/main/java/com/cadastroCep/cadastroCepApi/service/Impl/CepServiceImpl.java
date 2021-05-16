package com.cadastroCep.cadastroCepApi.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastroCep.cadastroCepApi.excecoes.ExececaoRegraNegocio;
import com.cadastroCep.cadastroCepApi.model.Cep;
import com.cadastroCep.cadastroCepApi.repository.CepRepository;
import com.cadastroCep.cadastroCepApi.service.CepService;
import com.cadastroCep.cadastroCepApi.service.dto.CepDTO;
import com.cadastroCep.cadastroCepApi.service.mapper.CepMapper;

@Service
@Transactional
public class CepServiceImpl implements CepService {

	@Autowired
	private CepRepository cepRepository;
	@Autowired
	private CepMapper cepMapper;
	
	@Override
	public CepDTO salvar(CepDTO cepDTO) {
		this.validarFaixaCep(cepDTO);
		this.validarLoja(cepDTO);
		this.verificarConflitoCep(cepDTO);
		return cepMapper.toDto(cepRepository.save(cepMapper.toEntity(cepDTO)));
	}
	
	@Override
	public CepDTO atualizar(CepDTO cepDTO) {
		this.validarId(cepDTO.getId());
		this.validarFaixaCep(cepDTO);
		this.validarLoja(cepDTO);
		this.verificarConflitoCep(cepDTO);
		return cepMapper.toDto(cepRepository.save(cepMapper.toEntity(cepDTO)));
	}
	
	@Override
	public void excluir(Long id) {
		this.validarId(id);
		cepRepository.deleteById(id);		
		
	}
	
	private void validarId(Long id) {
		if(id==null)
			throw new ExececaoRegraNegocio("Informar o id do registro");
	}
	
	private void validarFaixaCep(CepDTO cepDTO) {
		if(cepDTO.getFaixaInicio()==null)
			throw new ExececaoRegraNegocio("Faixa de inicio é obrigatória");
		if(cepDTO.getFaixaFim()==null)
			throw new ExececaoRegraNegocio("Faixa de fim é obrigatória");
		if(cepDTO.getFaixaInicio()>cepDTO.getFaixaFim())
			throw new ExececaoRegraNegocio("Faixa de inicio não pode ser maior que a faixa de fim");
	}
	
	private void validarLoja(CepDTO cepDTO) {
		if(cepDTO.getLojaDTO()==null||cepDTO.getLojaDTO().getId()==null)
			throw new ExececaoRegraNegocio("A loja é obrigatória");
	}
	
	private void verificarConflitoCep(CepDTO cepDTO) {
		List<Cep> listCep = cepRepository.validarFaixa(cepDTO.getFaixaInicio(), cepDTO.getFaixaFim(),
				cepDTO.getLojaDTO().getId());
		
		if(!listCep.isEmpty()) 
			throw new ExececaoRegraNegocio("Erro! Essa faixa de CEP conflita "
					+ " com a faixa de CEP da loja de "+listCep.get(0).getLoja().getNome());
		
	}

	

	

}
