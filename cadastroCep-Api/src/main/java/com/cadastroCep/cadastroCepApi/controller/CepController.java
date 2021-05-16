package com.cadastroCep.cadastroCepApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastroCep.cadastroCepApi.service.CepService;
import com.cadastroCep.cadastroCepApi.service.dto.CepDTO;

@RestController
@RequestMapping("/cep")
public class CepController {

	@Autowired
	private CepService cepService;

	@CrossOrigin
	@PostMapping
	public ResponseEntity<CepDTO> criar( @RequestBody CepDTO cepDTO){
		return ResponseEntity.status(HttpStatus.CREATED).body(cepService.salvar(cepDTO));
	}
	
	@CrossOrigin
	@PutMapping
	public ResponseEntity<CepDTO> atualizar( @RequestBody CepDTO cepDTO){
		return ResponseEntity.status(HttpStatus.OK).body(cepService.atualizar(cepDTO));
	}
	
	@CrossOrigin
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable(value = "id") Long id){
		cepService.excluir(id);
	}
}
