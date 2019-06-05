package br.com.fornaciari.desafio.icarros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import br.com.fornaciari.desafio.icarros.model.ResultGrandPrix;
import br.com.fornaciari.desafio.icarros.repository.ResultGrandPrixRepository;

@Service
public class ResultGrandPrixService {
	
	private final String URI = "https://ergast.com/api/f1/2017/last/results.json"; 
	
	@Autowired
	private ResultGrandPrixRepository grandPrixRepository;
	
	public ResultGrandPrix saveResult(ResultGrandPrix resultGrandPrix) {
		return grandPrixRepository.save(resultGrandPrix);
	}
	
	public List<ResultGrandPrix> listResult(){
		List<ResultGrandPrix> result = grandPrixRepository.findAll();
		if (result != null && !result.isEmpty()) {
			return result;
		}else {
			RestTemplate restTemplate = new RestTemplate();
			System.out.println(restTemplate.getForObject(URI, ResultGrandPrix.class));
		}
		return null;
	}
	
	public List<ResultGrandPrix> listTopFive(){
		List<ResultGrandPrix> listGrandPrix = grandPrixRepository.findAll();
		if (listGrandPrix!= null && !listGrandPrix.isEmpty()) {
			return listGrandPrix.subList(0, 4);
		}
		return null;
	}
}
