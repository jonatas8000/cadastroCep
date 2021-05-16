package com.cadastroCep.cadastroCepApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cadastroCep.cadastroCepApi.model.Cep;

@Repository
public interface CepRepository extends JpaRepository<Cep, Long> {

	@Query(value="select cep from Cep cep  "
			+" where ((cep.faixaInicio <= :faixaInicio  and cep.faixaFim >= :faixaFim ) "
			+" or (cep.faixaInicio <= :faixaFim and cep.faixaFim >= :faixaInicio )) "
			+ "and ( cep.loja.id <> :codigoLoja)  "
			)
	List<Cep> validarFaixa(Long faixaInicio,Long faixaFim,Long codigoLoja);
}
