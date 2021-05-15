package com.springudemy.learning.mvc;

import java.util.HashMap;
import java.util.Map;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	
	private Map<String, String> countryOptions;
	
	public Student() {
		countryOptions = new HashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("IN", "India");
		countryOptions.put("CA", "Canada");
		countryOptions.put("US", "United States");
	}
	
	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
}
