
package com.ride.sharing.app.entities;

import com.ride.sharing.app.enums.VehicleType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
	private int id;
	private int makeYear;
	private int company;
	private String registrationNo;
	private VehicleType vehicleType;
	private int totalSeats;
	
	public Vehicle(VehicleType type, String registrationNo) {
		this.vehicleType = type;
		this.registrationNo = registrationNo;
	}
}
