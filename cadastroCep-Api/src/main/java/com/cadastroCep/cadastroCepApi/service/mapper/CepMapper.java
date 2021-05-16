package com.cadastroCep.cadastroCepApi.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.cadastroCep.cadastroCepApi.model.Cep;
import com.cadastroCep.cadastroCepApi.service.dto.CepDTO;

@Mapper(componentModel = "spring")
public interface CepMapper extends EntityMapper<CepDTO, Cep> {

	@Mappings({@Mapping(source = "loja.id", target = "lojaDTO.id"),
		@Mapping(source = "loja.nome", target = "lojaDTO.nome")})
	 CepDTO toDto(Cep cep); 
	
	@Mappings({@Mapping(source = "lojaDTO.id", target = "loja.id"),
		@Mapping(source = "lojaDTO.nome", target = "loja.nome")})
	Cep toEntity(CepDTO cepDTO); 
}
