package com.arp.lti.beans;

import java.sql.Date;

public class SearchFlight {

	private String source;
	private String destination;
	private String departureDate;
	private String travelClass;
	public SearchFlight() {
		super();
	}
	public SearchFlight(String source, String destination, String departureDate, String travelClass) {
		super();
		this.source = source;
		this.destination = destination;
		this.departureDate = departureDate;
		this.travelClass = travelClass;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getTravelClass() {
		return travelClass;
	}
	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}
	@Override
	public String toString() {
		return "sFlight [source=" + source + ", destination=" + destination + ", departureDate=" + departureDate
				+ ", travelClass=" + travelClass + "]";
	}
	
	
	
	
	
}
