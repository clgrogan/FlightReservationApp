package com.core.flightreservation.models;

import java.util.Objects;

public class Flight extends AbstractModel{

	private String flightNumber;
	private String operatingAirline;
	private String departureCity;
	private String arrivalCity;
	private String departureDateTime;
	private static long nextID;
	
	static {
		nextID = 1;
	}
	
	public Flight() {
		this.setId(nextID++);
	}
	
	public Flight(String flightNumber, String operatingAirline, String departureCity, String arrivalCity,
			String departureDateTime) {
		this.flightNumber = flightNumber;
		this.operatingAirline = operatingAirline;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.departureDateTime = departureDateTime;
		this.setId(nextID++);
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAirline() {
		return operatingAirline;
	}
	public void setOperatingAirline(String operatingAirline) {
		this.operatingAirline = operatingAirline;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public String getDepartureDateTime() {
		return departureDateTime;
	}
	public void setDepartureDateTime(String departureDateTime) {
		this.departureDateTime = departureDateTime;
	}
	@Override
	public int hashCode() {
		return Objects.hash(flightNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return Objects.equals(flightNumber, other.flightNumber);
	}
	@Override
	public String toString() {
		return "Flight [id=" + getId() +", flightNumber=" + flightNumber + ", operatingAirline=" + operatingAirline + ", departureCity="
				+ departureCity + ", arrivalCity=" + arrivalCity + ", departureDateTime=" + departureDateTime
				+  "]";
	}
	
	
	

}
