package com.coderscampus.assignment10.service;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class SpoonacularIntegrationService {
	
	private RestTemplate restTemplate = new RestTemplate();
	
	@Value("${api.key}")
	private String apiKey;
	
	@Value("${spoonacular.urls.base}")
	private String baseUrl;
	
	
	@Value("${spoonacular.urls.mealplan}")
	private String mealPlanUrl;
	
	
	
	public <T> ResponseEntity<?> getResponse(Optional<String> numCalories, Optional<String> diet,  @RequestParam("exclude")  Optional<String> exclusions, String timeFrame, Class<T> responseClass){
		
		URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl.concat(mealPlanUrl))
				// Set timeFrame as "week" by default
				// given endpoint expilicitly specifies it
 	 	 	 	 .queryParam("timeFrame",timeFrame)
 	 	 	 	 .queryParamIfPresent("targetCalories", numCalories)
 	 	 	 	 .queryParamIfPresent("diet", diet)
 	 	 	 	 .queryParamIfPresent("exclude", exclusions)
 	 	 	 	 .queryParam("apiKey",apiKey)
 	 	 	 	
 	 	 	 	 
 	 	 	 	 .build().toUri();
		
		ResponseEntity<T> response = restTemplate.getForEntity(uri, responseClass);
		
		ResponseEntity.of(Optional.ofNullable(null));
		return response;
	}
}
