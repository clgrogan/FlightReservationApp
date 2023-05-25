package com.core.flightreservation.dao;

import java.util.HashMap;

import com.core.flightreservation.models.Flight;
import com.core.flightreservation.models.Reservation;

public class ReservationDAOImpl implements ReservationDAO {
	HashMap<Long, Flight> flights;
	HashMap<Long, Reservation> reservations;

	public ReservationDAOImpl() {

		flights = populateFlights();
		reservations = new HashMap<>();
	}

	@Override
	public Reservation bookFlight(Reservation reservation) {
		reservations.put(reservation.getId(), reservation);
		return reservation;
	}

	@Override
	public Flight getFlightById(long flightId) {
		
		return flights.get(flightId);
	}

	@Override
	public Reservation checkIn(long reservationId, int bags) {
		Reservation reservation = reservations.get(reservationId);
		reservation.setCheckedIn(true);
		reservation.setBags(bags);
		return reservation;
	}

	@Override
	public Reservation cancelCheckIn(long reservationId) {
		Reservation reservation = reservations.get(reservationId);
		reservation.setCheckedIn(false);
		reservation.setBags(0);
		return reservation;
	}
	
	private HashMap<Long, Flight> populateFlights() {
		HashMap<Long, Flight> fs = new HashMap<>();
		Flight f1 = new Flight("123", "Amarican Airlines", "Denver", "Tampa", "5/22/2024 8AM");
		Flight f2 = new Flight("800", "Delta", "Lockerbie", "New York", "5/21/2024 10PM");
		Flight f3 = new Flight("666", "Alegiant", "Anywhere", "Hades", "6/06/2006 6AM");
		fs.put(f1.getId(), f1);
		fs.put(f2.getId(), f2);
		fs.put(f3.getId(), f3);

		return fs;
	}

}
