package com.arp.lti.dao;

import java.util.Date;
import java.util.List;

import com.arp.lti.beans.Booking;
import com.arp.lti.beans.Flight;
import com.arp.lti.beans.User;
import com.arp.lti.beans.SearchFlight;

public interface BookingDao {


	//public List<Flight> searchFlight(String source, String destination,Date departureDate, String travelClass);
	public List<Flight> searchFlight(SearchFlight sf);
	public Booking addBooking(Booking b);
	//public long addBookings(Booking b, String travelClass, int flightId, int userId);
	public List<Booking> viewBooking(int userId);
	public String deleteBooking(int bookingId);

	
	
}