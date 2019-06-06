package br.com.fornaciari.desafio.icarros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@ApiOperation(value = "Retorna a tabela de resultados da última corrida de formula 1 de 2017")
	@RequestMapping(value = "/resultGrandPrix", method = RequestMethod.GET)
	public List<ResultGrandPrix> listResultGrandPrix () {
		return grandPrixService.listResult();
	}
	
	@ApiOperation(value = "Retorna o pódio da última corrida de formula 1 de 2017")
	@RequestMapping(value = "/resultPodium", method = RequestMethod.GET)
	public List<ResultGrandPrix> listTopThreeGrandPrix () {
		return grandPrixService.listTopThree();
	}
}
