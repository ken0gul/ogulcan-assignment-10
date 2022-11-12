package com.coderscampus.assignment10.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.assignment10.dto.DayResponse;
import com.coderscampus.assignment10.dto.WeekResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;


@RestController
public class Controller {
	
	@Value("${spoonacular.urls.base}")
	private String baseUrl;
	
	
	@Value("${spoonacular.urls.mealplan}")
	private String mealPlanUrl;
	
	
	
	
	@GetMapping("/mealplanner/week")
	
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam("targetCalories")  Integer numCalories,  @RequestParam String diet,  @RequestParam("exclude")  String exclusions) throws JsonMappingException, JsonProcessingException {
		
		//Concatenate two strings to craete a base url for the api
		String url  =baseUrl+mealPlanUrl;
		
		RestTemplate restTemplate = new RestTemplate();
		URI uri = UriComponentsBuilder.fromHttpUrl(url)
				// Set timeFrame as "week" by default
				// given endpoint expilicitly specifies it
 	 	 	 	 .queryParam("timeFrame","week")
 	 	 	 	 .queryParam("targetCalories",numCalories)
 	 	 	 	 .queryParam("diet", diet)
 	 	 	 	 .queryParam("exclude", exclusions)
 	 	 	 	 .queryParam("apiKey","e517a0a00a7a4b0093c05d501d45ee96")
 	 	 	 	 .build().toUri();
			
		
		 ResponseEntity<WeekResponse> response = restTemplate.getForEntity(uri, WeekResponse.class);
		 
		
		
		
		
		return response;
	}

	@GetMapping("/mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam("targetCalories")  Integer numCalories,  @RequestParam String diet,  @RequestParam("exclude")  String exclusions) throws JsonMappingException, JsonProcessingException {

		
		String url  =baseUrl+mealPlanUrl;
		RestTemplate restTemplate = new RestTemplate();
		URI uri = UriComponentsBuilder.fromHttpUrl(url)
				
 	 	 	 	 .queryParam("timeFrame","day")
 	 	 	 	 .queryParam("targetCalories",numCalories)
 	 	 	 	 .queryParam("diet", diet)
 	 	 	 	 .queryParam("exclude", exclusions)
 	 	 	 	 .queryParam("apiKey","e517a0a00a7a4b0093c05d501d45ee96")
 	 	 	 	 .build().toUri();
			
		
		 ResponseEntity<DayResponse> response = restTemplate.getForEntity(uri, DayResponse.class);
		 
		
		
		
		
		return response;
	}
}
