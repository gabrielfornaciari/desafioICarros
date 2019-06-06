package br.com.fornaciari.desafio.icarros.model.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultGrandPrixJson {
	
	@JsonProperty
	private MRDataJson MRData;

	public MRDataJson getMRData() {
		return MRData;
	}

	public void setMRData(MRDataJson mRData) {
		MRData = mRData;
	}
	
}
