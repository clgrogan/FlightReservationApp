package com.core.flightreservation.main;

import com.core.flightreservation.dao.ReservationDAOImpl;
import com.core.flightreservation.models.Passenger;
import com.core.flightreservation.models.Reservation;
import com.core.flightreservation.dao.ReservationDAO;

public class ReservationApp {

	public static void main(String[] args) {

		System.out.println("\nFlight Reservation App - Demonstrate Core Java Functionality\n");
		
		ReservationDAO dao = new ReservationDAOImpl();
		
		Reservation reservation1 = new Reservation();
		Passenger passenger1 = new Passenger("Joe", null, "Bishop", "joeb@mail.com", "123-867-5309");
		reservation1.setPassenger(passenger1);
		reservation1.setFlight(dao.getFlightById(1l));
		Reservation bookedReservation1 = dao.bookFlight(reservation1);
		Reservation savedReservation = dao.checkIn(reservation1.getId(), 55);
		System.out.println(bookedReservation1);
		System.out.println("\nConfirm the returned reservation is in fact a reference to the original reservation.");
		System.out.println("reservation1 == savedReservation:   " + (reservation1 == savedReservation));
		System.out.println("reservation1 == bookedReservation1: " + (reservation1 == bookedReservation1));

		
		Reservation reservation2 = new Reservation();
		Passenger passenger2 = new Passenger("Bob", "Orville", "Bologna", "bob@mail.com", "555-867-5309");
		reservation2.setPassenger(passenger2);
		reservation2.setFlight(dao.getFlightById(3l));
		dao.bookFlight(reservation2);
		dao.checkIn(reservation2.getId(), 2);
		System.out.println("\nreservation2:\n"+reservation2);
		dao.cancelCheckIn(reservation2.getId());
		System.out.println("\nreservation2:\n"+reservation2);

	}

}
