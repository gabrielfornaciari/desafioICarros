package br.com.fornaciari.desafio.icarros.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Document(collection = "formula1")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultGrandPrix {
	
	public ResultGrandPrix() {
		
	}
	
	public ResultGrandPrix(String position, Integer number, String driver, String constructor, Integer laps,
			Integer grid, String time, String status, Integer points) {
		super();
		this.position = position;
		this.number = number;
		this.driver = driver;
		this.constructor = constructor;
		this.laps = laps;
		this.grid = grid;
		this.time = time;
		this.status = status;
		this.points = points;
	}



	@Id
	private String id;
	
	private String position;
	
	private Integer number;
	
	private String driver;
	
	private String constructor;
	
	private Integer laps;
	
	private Integer grid;
	
	private String time;
	
	private String status;
	
	private Integer points;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getConstructor() {
		return constructor;
	}

	public void setConstructor(String constructor) {
		this.constructor = constructor;
	}

	public Integer getLaps() {
		return laps;
	}

	public void setLaps(Integer laps) {
		this.laps = laps;
	}

	public Integer getGrid() {
		return grid;
	}

	public void setGrid(Integer grid) {
		this.grid = grid;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}
	
}
