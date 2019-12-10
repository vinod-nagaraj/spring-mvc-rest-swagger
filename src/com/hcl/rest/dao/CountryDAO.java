package com.hcl.rest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.rest.entity.Country;

@Repository
public class CountryDAO {
	@Autowired
	private SessionFactory sessionFactory;
 
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
 
	@SuppressWarnings("rawtypes")
	public List getAllCountries() {
		Session session = this.sessionFactory.getCurrentSession();
		List countryList = session.createCriteria(Country.class).list();
		return countryList;
	}
 
//	public Country getCountry(int id) {
//		Session session = this.sessionFactory.getCurrentSession();
//		Country country = (Country) session.load(Country.class, new Integer(id));
//		return country;
//	}
 
	public Country addCountry(Country country) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(country);
		return country;
	}
 
	public void updateCountry(Country country) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(country);
	}
 
	}
	
