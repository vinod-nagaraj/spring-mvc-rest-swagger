package com.hcl.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Country table in database
 */
@Entity
@Table(name="COUNTRY")
public class Country{
	
	@Id
	@Column(name="countryId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int countryId;
	
	@Column(name="countryName")
	String countryName;	
	
	@Column(name="population")
	long population;
	
	

	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public Country() {
		super();
	}
	public Country(int i, String countryName,long population) {
		super();
		this.countryId = i;
		this.countryName = countryName;
		this.population=population;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}	
	
}