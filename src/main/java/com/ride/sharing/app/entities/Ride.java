package com.ride.sharing.app.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.ride.sharing.app.enums.RideStatus;
import com.ride.sharing.app.enums.VehicleType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Ride {
	private String id;
	private City source;
	private City destination;
	private Driver offeredBy;
	private Date startTime;
	private Date createdOn;
	private RideStatus status;
	private int contributionPerPassenger;
	private int offeredSeats;
	private int availableSeats;
	private VehicleType vehicleType;
	private String registrationNo;
	private List<User> passenger;
	
	
	public Ride(Driver offeredBy, City source, City destination, int availableSeats,
			VehicleType vehicleType, String registrationNo) {
		this.offeredBy = offeredBy;
		this.id  = UUID.randomUUID().toString();
		this.source = source;
		this.destination = destination;
		this.availableSeats = availableSeats;
		this.status = RideStatus.OFFERED;
		this.registrationNo = registrationNo;
		this.vehicleType = vehicleType;
		passenger = new ArrayList<>();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public City getSource() {
		return source;
	}


	public void setSource(City source) {
		this.source = source;
	}


	public City getDestination() {
		return destination;
	}


	public void setDestination(City destination) {
		this.destination = destination;
	}


	public Driver getOfferedBy() {
		return offeredBy;
	}


	public void setOfferedBy(Driver offeredBy) {
		this.offeredBy = offeredBy;
	}


	public Date getStartTime() {
		return startTime;
	}


	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}


	public Date getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}


	public RideStatus getStatus() {
		return status;
	}


	public void setStatus(RideStatus status) {
		this.status = status;
	}


	public int getContributionPerPassenger() {
		return contributionPerPassenger;
	}


	public void setContributionPerPassenger(int contributionPerPassenger) {
		this.contributionPerPassenger = contributionPerPassenger;
	}


	public int getOfferedSeats() {
		return offeredSeats;
	}


	public void setOfferedSeats(int offeredSeats) {
		this.offeredSeats = offeredSeats;
	}


	public int getAvailableSeats() {
		return availableSeats;
	}


	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}


	public VehicleType getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}


	public String getRegistrationNo() {
		return registrationNo;
	}


	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}


	public List<User> getPassenger() {
		return passenger;
	}


	public void setPassenger(List<User> passenger) {
		this.passenger = passenger;
	}
	
	public void increment() {
		this.availableSeats++;
	}
	
	public void decrement() {
		this.availableSeats--;
	}
}
