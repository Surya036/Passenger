package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="passenger_details")
public class passengerModel {
	@Id
	@GeneratedValue
	public int passengeId;
	public String passengerName;
	public String passengerNative;
	public String passengerDeparture;
	public String passengerArrival;
	public int passengerAge;
	public String passengerGender;
	public int getPassengeId() {
		return passengeId;
	}
	public void setPassengeId(int passengeId) {
		this.passengeId = passengeId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getPassengerNative() {
		return passengerNative;
	}
	public void setPassengerNative(String passengerNative) {
		this.passengerNative = passengerNative;
	}
	public String getPassengerDeparture() {
		return passengerDeparture;
	}
	public void setPassengerDeparture(String passengerDeparture) {
		this.passengerDeparture = passengerDeparture;
	}
	public String getPassengerArrival() {
		return passengerArrival;
	}
	public void setPassengerArrival(String passengerArrival) {
		this.passengerArrival = passengerArrival;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getPassengerGender() {
		return passengerGender;
	}
	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}
	
}
