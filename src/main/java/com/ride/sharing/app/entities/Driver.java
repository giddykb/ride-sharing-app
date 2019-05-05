package com.ride.sharing.app.entities;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Driver extends User {

	private int licenseNo;
	private int insuranceNo;
	private int userId;
	private List<Vehicle> vehicles;
//	private int ridesOffered;
	
	public Driver() {
		// TODO Auto-generated constructor stub
	}
	
	public Driver(String name, int age, String gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}

	public int getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(int licenseNo) {
		this.licenseNo = licenseNo;
	}

	public int getInsuranceNo() {
		return insuranceNo;
	}

	public void setInsuranceNo(int insuranceNo) {
		this.insuranceNo = insuranceNo;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	/*public int getRidesOffered() {
		return ridesOffered;
	}

	public void setRidesOffered(int ridesOffered) {
		this.ridesOffered = ridesOffered;
	}*/
	
	
}
