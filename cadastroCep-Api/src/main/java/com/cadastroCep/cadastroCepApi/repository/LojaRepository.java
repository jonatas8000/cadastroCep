package com.cadastroCep.cadastroCepApi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cadastroCep.cadastroCepApi.model.Loja;

public interface LojaRepository extends JpaRepository<Loja, Long> {

	@Query(value="select distinct (cep.loja) from Cep cep  "
			+" where (cep.faixaInicio <= :cep  and cep.faixaFim >= :cep ) "	
			)
	Optional<Loja> buscarLojaPorCep(Long cep);
}
