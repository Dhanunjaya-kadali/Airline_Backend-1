package com.arp.lti.services;

import java.util.List;

import com.arp.lti.beans.Passenger;

public interface PassengerService {

	public Passenger addPassenger(Passenger p);

	public List<Passenger> listAllPassengers();

	public Passenger findPassengerById(String passId);

}
