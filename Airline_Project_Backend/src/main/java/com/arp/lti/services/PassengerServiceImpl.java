package com.arp.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arp.lti.beans.Passenger;
import com.arp.lti.dao.PassengerDao;

@Service("passengerService")
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerDao dao;

	@Override
	public Passenger addPassenger(Passenger p) {
		// TODO Auto-generated method stub
		return dao.addPassenger(p);
	}

	public List<Passenger> listAllPassengers() {
		List<Passenger> passList = dao.listAllPassengers();
		return passList;
	}

	public Passenger findPassengerById(String passId) {
		Passenger p = dao.findPassengerById(passId);
		return p;
	}
}
