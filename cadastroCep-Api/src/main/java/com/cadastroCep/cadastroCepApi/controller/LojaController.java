package com.cadastroCep.cadastroCepApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastroCep.cadastroCepApi.service.LojaService;
import com.cadastroCep.cadastroCepApi.service.dto.LojaDTO;

@RestController
@RequestMapping("/loja")
public class LojaController {
	
	@Autowired
	private LojaService lojaService;

	@CrossOrigin
	@PostMapping
	public ResponseEntity<LojaDTO> criar( @RequestBody LojaDTO lojaDTO){
		return ResponseEntity.status(HttpStatus.CREATED).body(lojaService.salvar(lojaDTO));
	}
	
	@CrossOrigin
	@GetMapping("/cep/{cep}")
	public ResponseEntity<LojaDTO> buscarLojaPorCep(@PathVariable(value = "cep") Long cep){
		return ResponseEntity.status(HttpStatus.OK).body(lojaService.buscarLojaPorCep(cep));
	}
	
}
