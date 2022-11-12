package com.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meals {
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("imageType")
	private String imageType;
	@JsonProperty("readyInMinutes")
	private String readyInMinutes;
	@JsonProperty("servings")
	private Integer servings;
	@JsonProperty("sourceUrl")
	private String sourceUrl;
	
	

	
	public Meals() {
		
	}




	public Meals(Integer id, String title, String imageType, String readyInMinutes, Integer servings,
			String sourceUrl) {
		super();
		this.id = id;
		this.title = title;
		this.imageType = imageType;
		this.readyInMinutes = readyInMinutes;
		this.servings = servings;
		this.sourceUrl = sourceUrl;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getImageType() {
		return imageType;
	}




	public void setImageType(String imageType) {
		this.imageType = imageType;
	}




	public String getReadyInMinutes() {
		return readyInMinutes;
	}




	public void setReadyInMinutes(String readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}




	public Integer getServings() {
		return servings;
	}




	public void setServings(Integer servings) {
		this.servings = servings;
	}




	public String getSourceUrl() {
		return sourceUrl;
	}




	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}




	@Override
	public String toString() {
		return "Meals [id=" + id + ", title=" + title + ", imageType=" + imageType + ", readyInMinutes="
				+ readyInMinutes + ", servings=" + servings + ", sourceUrl=" + sourceUrl + "]";
	}

	
	
}
