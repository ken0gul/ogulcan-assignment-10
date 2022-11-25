package com.coderscampus.assignment10.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.assignment10.dto.DayResponse;
import com.coderscampus.assignment10.dto.WeekResponse;
import com.coderscampus.assignment10.service.SpoonacularIntegrationService;


@RestController
public class MealPlannerController {
	
	@Value("${spoonacular.urls.base}")
	private String baseUrl;
	
	
	@Value("${spoonacular.urls.mealplan}")
	private String mealPlanUrl;
	
	
	@Autowired
	private SpoonacularIntegrationService integrationService;



	
	@GetMapping("/mealplanner/week")
	public <T> ResponseEntity<?> getWeekMeals(@RequestParam("targetCalories")  Optional<String> numCalories,  @RequestParam  Optional<String> diet,  @RequestParam("exclude")  Optional<String> exclusions, String timeFrame, Class<T> responseClass) {
		return integrationService.getResponse(numCalories, diet, exclusions, "week", WeekResponse.class);
	}
	@GetMapping("/mealplanner/day")
	public <T> ResponseEntity<?> getDayMeals(@RequestParam("targetCalories")  Optional<String> numCalories,  @RequestParam  Optional<String> diet,  @RequestParam("exclude")  Optional<String> exclusions, String timeFrame, Class<T> responseClass) {
		return integrationService.getResponse(numCalories, diet, exclusions, "day", DayResponse.class);
	}
	
}
