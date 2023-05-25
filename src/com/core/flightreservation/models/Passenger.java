package com.core.flightreservation.models;

import java.util.Objects;

public class Passenger extends AbstractModel {
	static Long nextID;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String phone;

	static {
		nextID = 100000l;
	}
	public Passenger() {
		this.setId(nextID++);
	}
	
	

	public Passenger(String firstName, String middleName, String lastName, String email, String phone) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.setId(nextID++);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, middleName, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(middleName, other.middleName) && Objects.equals(phone, other.phone);
	}

	@Override
	public String toString() {
		return "Passenger [id="+getId()+", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", email=" + email + ", phone=" + phone + "]";
	}

}
