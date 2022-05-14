package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IAirlineRepository;

import com.faith.app.entity.Airline;


@Service
public class AirlineServiceImplementation implements IAirlineService {
	
	
	@Autowired
	 private IAirlineRepository airlineRepo;

	@Override
	public List<Airline> getAirlines() {
		return (List<Airline>) airlineRepo.findAll();
	
	}

	@Override
	public void saveAirline(Airline airline) {
		airlineRepo.save( airline);
		
	}

	@Override
	public Optional<Airline> getAirline(int id) {
		return  airlineRepo.findById(id);
	}

	@Override
	public void deleteAirline(int id) {
		airlineRepo.deleteById(id);
		
	}

	@Override
	public List<Airline> getAirlinesByAirlineName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	//public List<Airline> getAirlinesByAirlineName(String name) {
		//return (List<Airline>)   airlineRepo.findById(name);
	}


