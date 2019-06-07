package br.com.fornaciari.desafio.icarros.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fornaciari.desafio.icarros.model.ResultGrandPrix;
import br.com.fornaciari.desafio.icarros.service.ResultGrandPrixService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Result Grand Prix")
public class ResultGrandPrixController {
	
	@Autowired
	ResultGrandPrixService grandPrixService;
	
	@ApiOperation(value = "Retorna a tabela de resultados da última corrida de formula 1")
	@RequestMapping(value = "/resultGrandPrix/{year}", method = RequestMethod.GET)
	public List<ResultGrandPrix> listResultGrandPrixPerYear(@PathVariable Integer year){
		return grandPrixService.listResultPerYear(year);
	}
	
	@ApiOperation(value = "Retorna o pódio da última corrida de formula 1")
	@RequestMapping(value = "/resultGrandPrixPodium/{year}", method = RequestMethod.GET)
	public List<ResultGrandPrix> resultGrandPrixPodium(@PathVariable Integer year){
		return grandPrixService.listTopThreePerYear(year);
	}
}
