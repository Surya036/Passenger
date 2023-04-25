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
	public int passenger_Id;
	public String passenger_Name;
	public String passenger_Native;
	public String passenger_Departure;
	public String passenger_Arrival;
	public int passenger_Age;
	public String passenger_Gender;
	public int getPassenger_Id() {
		return passenger_Id;
	}
	public void setPassenger_Id(int passenger_Id) {
		this.passenger_Id = passenger_Id;
	}
	public String getPassenger_Name() {
		return passenger_Name;
	}
	public void setPassenger_Name(String passenger_Name) {
		this.passenger_Name = passenger_Name;
	}
	public String getPassenger_Native() {
		return passenger_Native;
	}
	public void setPassenger_Native(String passenger_Native) {
		this.passenger_Native = passenger_Native;
	}
	public String getPassenger_Departure() {
		return passenger_Departure;
	}
	public void setPassenger_Departure(String passenger_Departure) {
		this.passenger_Departure = passenger_Departure;
	}
	public String getPassenger_Arrival() {
		return passenger_Arrival;
	}
	public void setPassenger_Arrival(String passenger_Arrival) {
		this.passenger_Arrival = passenger_Arrival;
	}
	public int getPassenger_Age() {
		return passenger_Age;
	}
	public void setPassenger_Age(int passenger_Age) {
		this.passenger_Age = passenger_Age;
	}
	public String getPassenger_Gender() {
		return passenger_Gender;
	}
	public void setPassenger_Gender(String passenger_Gender) {
		this.passenger_Gender = passenger_Gender;
	}
	
}
