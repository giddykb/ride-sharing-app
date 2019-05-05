package com.ride.sharing.app.repositry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ride.sharing.app.entities.Driver;
import com.ride.sharing.app.entities.Passenger;
import com.ride.sharing.app.entities.User;
import com.ride.sharing.app.entities.Vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRespositry {
	
	HashMap<String, User>  usersMap;
	HashMap<String, List<Vehicle>> vehicleOwners;

	// Redundant
	HashMap<String, Passenger> ridesTakenPassengers;
	HashMap<String, Driver> ridesOfferedDrivers;

	
	public UserRespositry() {
		usersMap = new HashMap<>();
		ridesTakenPassengers = new HashMap<>();
		ridesOfferedDrivers = new HashMap<>();
		vehicleOwners = new HashMap<>();
	}
	
	public void addUser(User user) {
		usersMap.put(user.getName(), user);
	}
	
	public void addVechicle(String name, Vehicle vehicle) {
		Driver user = (Driver) usersMap.get(name);
		if(user !=null) {
			
			if (user.getVehicles() == null) {
				user.setVehicles(new ArrayList<>());
			}
			user.getVehicles().add(vehicle);
			ridesOfferedDrivers.put(name, user);
			
			vehicleOwners.putIfAbsent(name, new ArrayList<>());
			vehicleOwners.get(name).add(vehicle);
		}
	}
	
	public List<User> getUsers(){
		return new ArrayList<>(usersMap.values());
	}
	
	
}
