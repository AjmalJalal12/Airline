package com.faith.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.faith.app.entity.Airline;

public interface IAirlineRepository extends CrudRepository<Airline, Integer> {
	
	

}
