package br.com.fornaciari.desafio.icarros.model.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultsJson {

	@JsonProperty
	private Integer number;

	@JsonProperty
	private String position;

	@JsonProperty
	private Integer points;

	@JsonProperty
	private Integer grid;

	@JsonProperty
	private Integer laps;

	@JsonProperty
	private String status;

	@JsonProperty
	private DriverJson Driver;

	@JsonProperty
	private ConstructorJson Constructor;

	@JsonProperty
	private TimeJson Time;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getGrid() {
		return grid;
	}

	public void setGrid(Integer grid) {
		this.grid = grid;
	}

	public Integer getLaps() {
		return laps;
	}

	public void setLaps(Integer laps) {
		this.laps = laps;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public DriverJson getDriver() {
		return Driver;
	}

	public void setDriver(DriverJson driver) {
		Driver = driver;
	}

	public ConstructorJson getConstructor() {
		return Constructor;
	}

	public void setConstructor(ConstructorJson constructor) {
		Constructor = constructor;
	}

	public TimeJson getTime() {
		return Time;
	}

	public void setTime(TimeJson time) {
		Time = time;
	}

}
