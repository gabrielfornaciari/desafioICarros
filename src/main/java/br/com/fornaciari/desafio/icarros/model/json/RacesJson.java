package br.com.fornaciari.desafio.icarros.model.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RacesJson {
	
	@JsonProperty
	private List<ResultsJson> Results;

	public List<ResultsJson> getResults() {
		return Results;
	}

	public void setResults(List<ResultsJson> results) {
		Results = results;
	}
	
}
