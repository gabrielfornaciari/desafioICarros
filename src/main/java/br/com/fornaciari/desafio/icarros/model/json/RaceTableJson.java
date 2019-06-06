package br.com.fornaciari.desafio.icarros.model.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RaceTableJson {
	
	@JsonProperty
	private List<RacesJson> Races;

	public List<RacesJson> getRaces() {
		return Races;
	}

	public void setRaces(List<RacesJson> races) {
		Races = races;
	}
	
}
