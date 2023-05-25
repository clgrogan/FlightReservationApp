package com.core.flightreservation.models;

import java.util.Objects;

public class Reservation extends AbstractModel {
	private Passenger passenger;
	private Flight flight;
	private long flightId;
	private int bags;
	private boolean checkedIn;
	private static long nextID;

	static {
		nextID = 100;
	}

	public Reservation() {
		this.setId(nextID++);
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
		this.flightId = flight.getId();
	}

	public long getFlightId() {
		return flightId;
	}

	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	public int getBags() {
		return bags;
	}

	public void setBags(int bags) {
		this.bags = bags;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(flight, flightId, passenger);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		return Objects.equals(flight, other.flight) && flightId == other.flightId
				&& Objects.equals(passenger, other.passenger);
	}

	@Override
	public String toString() {
		return "Reservation [id=" + getId() + ", passenger=" + passenger + ", flight=" + flight + ", flightId="
				+ flightId + ", getId()=" + ", bags=" + bags + ", checkedIn=" + checkedIn + "]";
	}

}
