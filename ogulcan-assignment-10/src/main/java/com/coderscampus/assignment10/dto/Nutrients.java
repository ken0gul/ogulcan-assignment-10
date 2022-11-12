package com.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {
	@JsonProperty("calories")
	private Integer calories;
	@JsonProperty("carbohydrates")
	private Integer carbohydrates;
	@JsonProperty("fat")
	private Integer fat;
	@JsonProperty("protein")
	private Integer protein;

	public Nutrients() {

	}

	public Nutrients(Integer calories, Integer carbohydrates, Integer fat, Integer protein) {
		super();
		this.calories = calories;
		this.carbohydrates = carbohydrates;
		this.fat = fat;
		this.protein = protein;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Integer getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(Integer carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public Integer getFat() {
		return fat;
	}

	public void setFat(Integer fat) {
		this.fat = fat;
	}

	public Integer getProtein() {
		return protein;
	}

	public void setProtein(Integer protein) {
		this.protein = protein;
	}

}
