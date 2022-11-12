package com.coderscampus.assignment10.dto;

import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonProperty;

@ResponseBody
public class DayResponse {
	
	@JsonProperty("timeFrame")
	private String day = "day";
	@JsonProperty("targetCalories")
	private Integer targetCalories;
	@JsonProperty("diet")
	private String diet;
	@JsonProperty("exclude")
	private String 	exclude;
	
	
	public DayResponse() {
		
	}
	public DayResponse(String day, Integer targetCalories, String diet, String exclude) {
		super();
		this.day = day;
		this.targetCalories = targetCalories;
		this.diet = diet;
		this.exclude = exclude;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Integer getTargetCalories() {
		return targetCalories;
	}
	public void setTargetCalories(Integer targetCalories) {
		this.targetCalories = targetCalories;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	public String getExclude() {
		return exclude;
	}
	public void setExclude(String exclude) {
		this.exclude = exclude;
	}
	
	
	
}
