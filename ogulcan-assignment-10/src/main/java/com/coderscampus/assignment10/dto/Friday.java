package com.coderscampus.assignment10.dto;

import java.util.List;

public class Friday {
	private List<Meals> meals;
	private Nutrients nutrients;
	public List<Meals> getMeals() {
		return meals;
	}
	public Nutrients getNutrients() {
		return nutrients;
	}
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}

	
	
}
