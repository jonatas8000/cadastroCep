package com.cadastroCep.cadastroCepApi.service.mapper;

import org.mapstruct.Mapper;

import com.cadastroCep.cadastroCepApi.model.Loja;
import com.cadastroCep.cadastroCepApi.service.dto.LojaDTO;

@Mapper(componentModel = "spring")
public interface LojaMapper extends EntityMapper<LojaDTO, Loja> {

}
