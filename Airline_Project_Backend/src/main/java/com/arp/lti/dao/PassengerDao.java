package com.arp.lti.dao;

import java.util.List;

import com.arp.lti.beans.Passenger;

public interface PassengerDao {

	public Passenger addPassenger(Passenger p);
	
	public List<Passenger> listAllPassengers();
	
	public abstract Passenger findPassengerById(String passId);
	
	
}
