package com.cadastroCep.cadastroCepApi.excecoes;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cadastroCep.cadastroCepApi.service.dto.ExcecoesRetornoApiDTO;

@ControllerAdvice
public class ResourceExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ExececaoRegraNegocio.class)
	public ResponseEntity<ExcecoesRetornoApiDTO> handleExcecaoRegraNegocio(ExececaoRegraNegocio e, HttpServletRequest request, HandlerMethod handlerMethod){
		ExcecoesRetornoApiDTO excecoesRetornoApiDTO = new ExcecoesRetornoApiDTO(400, ApiSatus.DADO_INVALIDO.httpStatus.toString(), e.getMessage());
		return new ResponseEntity<ExcecoesRetornoApiDTO>(excecoesRetornoApiDTO,ApiSatus.DADO_INVALIDO.httpStatus);
	}
}
