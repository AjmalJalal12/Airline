package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.entity.Airline;



public interface IAirlineService {
	

    //List
	public List<Airline>getAirlines();
	
	//Insert/Update
	public void saveAirline(Airline airline);
	
	//Search By Id
   public Optional <Airline> getAirline(int id);
   
   //Delete
   public void deleteAirline(int id);
   
   //Find By EmployeeName--Custom Methods
   public List<Airline> getAirlinesByAirlineName(String name);

}
