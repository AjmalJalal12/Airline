package com.faith.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Airline;

import com.faith.app.service.IAirlineService;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class AirlineController {
	
	
	@Autowired
	private IAirlineService  airlineService;
	
	
	//Get All  Airline
		@GetMapping("/airlines")
		public List<Airline> getAllEmployees() {
			
			  return airlineService.getAirlines();
		}
	
		
		//Get  Airline By Id
		@GetMapping("/airlines/{id}")
		public Optional<Airline> getAirline(@PathVariable int id){
			
			return airlineService.getAirline(id);
		}
	
		//Add  Employee
		@PostMapping("/airlines")
		public void addAirline(@RequestBody Airline airline) {
			 
			airlineService.saveAirline(airline);
		}
		
		
		//Update  Employee
		@PutMapping("/airlines")
		public void updateEmployee(@RequestBody Airline airline) {
			
			airlineService.saveAirline(airline);
		}
		
		
		//Delete  Employee
		@DeleteMapping("/airlines/{id}")
		public void deleteAirline( @PathVariable int id) {
			
			airlineService.deleteAirline(id);
		}
		
	 

}
