package br.com.fornaciari.desafio.icarros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fornaciari.desafio.icarros.model.ResultGrandPrix;
import br.com.fornaciari.desafio.icarros.service.ResultGrandPrixService;

@RestController
public class ResultGrandPrixController {
	
	@Autowired
	ResultGrandPrixService grandPrixService;
	
	@RequestMapping(value = "/resultGrandPrix", method = RequestMethod.GET)
	public List<ResultGrandPrix> listResultGrandPrix () {
		return grandPrixService.listResult();
	}
	
	@RequestMapping(value = "/resultTopFive", method = RequestMethod.GET)
	public List<ResultGrandPrix> listTopFiveGrandPrix () {
		return grandPrixService.listTopFive();
	}
}
