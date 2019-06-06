package br.com.fornaciari.desafio.icarros.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.fornaciari.desafio.icarros.model.ResultGrandPrix;
import br.com.fornaciari.desafio.icarros.model.json.RacesJson;
import br.com.fornaciari.desafio.icarros.model.json.ResultGrandPrixJson;
import br.com.fornaciari.desafio.icarros.model.json.ResultsJson;
import br.com.fornaciari.desafio.icarros.repository.ResultGrandPrixRepository;

@Service
public class ResultGrandPrixService {

	private final String URI = "https://ergast.com/api/f1/2017/last/results.json";

	@Autowired
	private ResultGrandPrixRepository grandPrixRepository;

	public ResultGrandPrix saveResult(ResultGrandPrix resultGrandPrix) {
		return grandPrixRepository.save(resultGrandPrix);
	}

	public List<ResultGrandPrix> listResult() {
		List<ResultGrandPrix> result = grandPrixRepository.findAll();
		if (result != null && !result.isEmpty()) {
			return result;
		} else {
			List<ResultGrandPrix> resultsGrandPrix = searchInApi();
			for (ResultGrandPrix resultGrandPrix : resultsGrandPrix) {
				saveResult(resultGrandPrix);
			}
			return resultsGrandPrix;
		}
	}

	public List<ResultGrandPrix> listTopThree() {
		List<ResultGrandPrix> listGrandPrix = grandPrixRepository.findAll();
		if (listGrandPrix != null && !listGrandPrix.isEmpty()) {
			return listGrandPrix.subList(0, 3);
		} else {
			List<ResultGrandPrix> resultsGrandPrix = searchInApi();
			for (ResultGrandPrix resultGrandPrix : resultsGrandPrix) {
				saveResult(resultGrandPrix);
			}

			return resultsGrandPrix.subList(0, 3);
		}
	}

	private List<ResultGrandPrix> searchInApi() {
		List<ResultGrandPrix> results = new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ResultGrandPrixJson> responseEntity = restTemplate.getForEntity(URI, ResultGrandPrixJson.class);
		List<RacesJson> races = responseEntity.getBody().getMRData().getRaceTable().getRaces();
		for (RacesJson race : races) {
			for (ResultsJson result : race.getResults()) {
				ResultGrandPrix resultGrandPrix = new ResultGrandPrix();
				resultGrandPrix.setConstructor(result.getConstructor().getName());
				resultGrandPrix.setDriver(result.getDriver().getGivenName() + " " + result.getDriver().getFamilyName());
				resultGrandPrix.setGrid(result.getGrid());
				resultGrandPrix.setLaps(result.getLaps());
				resultGrandPrix.setNumber(result.getNumber());
				resultGrandPrix.setPoints(result.getPoints());
				resultGrandPrix.setPosition(result.getPosition());
				resultGrandPrix.setStatus(result.getStatus());
				if (result.getTime() != null) {
					resultGrandPrix.setTime(result.getTime().getTime());
				}
				results.add(resultGrandPrix);
			}
		}

		return results;
	}
}
