package com.arp.lti.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.arp.lti.beans.Passenger;

@Repository("passengerDao")
@EnableTransactionManagement
public class PassengerDaoImpl implements PassengerDao {
	static int count = 0;
	@PersistenceContext
	private EntityManager em;

	@Transactional
	@Override
	public Passenger addPassenger(Passenger p) {

//		int bId = p.getBooking().getBookingId();
//		String query = "Select b from Booking b where b.bookingId =:bId ";
//		TypedQuery<Booking> tq = em.createQuery(query, Booking.class);
//		tq.setParameter("bId", bId);
//		Booking b = tq.getSingleResult();
//		System.out.println("feffefefeff" + p);
//		p.setBooking(b);
//	
		List<Integer> seatNos = new ArrayList();

		for (int i = 1; i < 61; i++) {
			seatNos.add(i);
		}

		p.setSeatNo(seatNos.get(count));
		count += 1;

		System.out.println(p);
		em.persist(p);
		System.out.println("persisted" + p);
		return p;
	}

	public List<Passenger> listAllPassengers() {

		String sql = "Select p From Passengers p";
		Query qry = em.createQuery(sql);
		List<Passenger> passList = qry.getResultList();
		// System.out.println("On do server: "+passList);
		return passList;
	}

	public Passenger findPassengerById(String passId) {
		Passenger p = em.find(Passenger.class, passId);
		return p;
	}

}
