package com.arp.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arp.lti.beans.Passenger;
import com.arp.lti.services.PassengerService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class PassengerController {

	@Autowired
	private PassengerService service;

	@PostMapping("/addPassenger")
	public Passenger addPassenger(@RequestBody Passenger p) {
		return service.addPassenger(p);
	}

	@GetMapping("/passengers")
	public List<Passenger> listAllPassengers() {

		return service.listAllPassengers();
	}

	@GetMapping("/passengers/{id}")
	public Passenger findPassengerById(@PathVariable(value = "id") String passId) {

		return service.findPassengerById(passId);
	}

}
