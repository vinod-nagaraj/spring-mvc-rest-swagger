package com.hcl.rest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.rest.dao.CountryDAO;
import com.hcl.rest.entity.Country;

@Service("countryService")
public class CountryService {

	@Autowired
	CountryDAO countryDao;
 
	@SuppressWarnings("rawtypes")
	@Transactional
	public List getAllCountries() {
		return countryDao.getAllCountries();
	}
 
//	@Transactional
//	public Country getCountry(int id) {
//		return countryDao.getCountry(id);
//	}
 
	@Transactional
	public void addCountry(Country country) {
		countryDao.addCountry(country);
	}
 
	@Transactional
	public void updateCountry(Country country) {
		countryDao.updateCountry(country);
 
	}
}
