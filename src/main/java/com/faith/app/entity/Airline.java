package com.faith.app.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;

@Entity
@Table(name = "airline")
public class Airline {
	
	//declaring variables
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "flightid")
	  private Integer flightId;
	  
	 @Column(name = "flightName",nullable = false,length = 40)
	  private String flightName;
	 
	 private String depAirport;
	 private Date depDate;
	 private String depTime;
	 private String arrAirport;
	 private Date arrDate;
	 private String arrTime;
	 
	 
	//default constructor
	 
	public Airline() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Airline(Integer flightId, String flightName, String depAirport, Date depDate, String depTime,
			String arrAirport, Date arrDate, String arrTime) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.depAirport = depAirport;
		this.depDate = depDate;
		this.depTime = depTime;
		this.arrAirport = arrAirport;
		this.arrDate = arrDate;
		this.arrTime = arrTime;
	}

	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getDepAirport() {
		return depAirport;
	}

	public void setDepAirport(String depAirport) {
		this.depAirport = depAirport;
	}

	public Date getDepDate() {
		return depDate;
	}

	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}

	public String getDepTime() {
		return depTime;
	}

	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}

	public String getArrAirport() {
		return arrAirport;
	}

	public void setArrAirport(String arrAirport) {
		this.arrAirport = arrAirport;
	}

	public Date getArrDate() {
		return arrDate;
	}

	public void setArrDate(Date arrDate) {
		this.arrDate = arrDate;
	}

	public String getArrTime() {
		return arrTime;
	}

	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}

	@Override
	public String toString() {
		return "Airline [flightId=" + flightId + ", flightName=" + flightName + ", depAirport=" + depAirport
				+ ", depDate=" + depDate + ", depTime=" + depTime + ", arrAirport=" + arrAirport + ", arrDate="
				+ arrDate + ", arrTime=" + arrTime + "]";
	}
	
	
	 

	
	 
	 
	 
	 
	 
	  
}