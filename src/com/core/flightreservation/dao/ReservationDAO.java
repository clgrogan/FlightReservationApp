package com.core.flightreservation.dao;

import com.core.flightreservation.models.Flight;
import com.core.flightreservation.models.Reservation;

public interface ReservationDAO {
	Reservation bookFlight(Reservation reservation);
	Flight getFlightById(long flightId);
	Reservation checkIn(long reservationId, int bags);
	Reservation cancelCheckIn(long reservationId);
}
