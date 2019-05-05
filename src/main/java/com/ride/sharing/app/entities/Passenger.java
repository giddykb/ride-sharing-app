package com.ride.sharing.app.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Passenger extends User {
	private int ridesTaken;
	
	public Passenger(String name, int age, String gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}

}
