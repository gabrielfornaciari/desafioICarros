package br.com.fornaciari.desafio.icarros.model.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MRDataJson {
		
	@JsonProperty
	private RaceTableJson RaceTable; 

	public RaceTableJson getRaceTable() {
		return RaceTable;
	}

	public void setRaceTable(RaceTableJson raceTable) {
		RaceTable = raceTable;
	}
	
}
