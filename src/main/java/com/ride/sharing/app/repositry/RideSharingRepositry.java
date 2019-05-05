package com.ride.sharing.app.repositry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.ride.sharing.app.entities.City;
import com.ride.sharing.app.entities.Ride;
import com.ride.sharing.app.entities.User;
import com.ride.sharing.app.enums.RideStatus;
import com.ride.sharing.app.enums.SeatStatus;

public class RideSharingRepositry {
	
	HashMap<String, HashMap<String, Ride>> sourceDestinationMap ;
	HashMap<String, Ride> allRidesMap ;
	
	public RideSharingRepositry() {
		sourceDestinationMap = new HashMap<>();;
		allRidesMap = new HashMap<>();
	}
	
	
	public void addRide(Ride ride, User user) {
		String key = ride.getSource().getName() + "||" + ride.getDestination().getName();
		sourceDestinationMap.putIfAbsent(key, new HashMap<>());
		sourceDestinationMap.get(key).put(ride.getId(), ride);
		allRidesMap.put(ride.getId(), ride);
		user.getRidesOffered().add(ride);
	}
	
	public void deleteRide(Ride ride) {
		if(allRidesMap.containsKey(ride.getId())) {
			String key = ride.getSource().getName() + "||" + ride.getDestination().getName();
			sourceDestinationMap.remove(key);
			allRidesMap.remove(ride.getId());
		}
	}
	
	public void updateStatus(Ride ride, RideStatus rideStatus) {
		if(allRidesMap.containsKey(ride.getId())) {
			ride.setStatus(rideStatus);
			allRidesMap.put(ride.getId(), ride);
			String key = ride.getSource().getName() + "||" + ride.getDestination().getName();
			if(rideStatus == RideStatus.END) {
				sourceDestinationMap.get(key).remove(ride.getId());
			} else {
				sourceDestinationMap.get(key).put(key, ride);
			}
		}
	}
	
	public List<Ride> ridesOfferedBy(User user) {
		return user.getRidesOffered();
	}
	
	public Ride getRideById(String id) {
		return allRidesMap.get(id);
	}
	
	public Collection<Ride> getBySourceAndDestination(City source, City destination) {
		String key = source.getName() +"||" + destination.getName();
		
		if(sourceDestinationMap.containsKey(key)) {
			return sourceDestinationMap.get(key).values();
		}
		return new ArrayList<>();
	}
	
	public void updateSeatStatus(User user, Ride ride, SeatStatus status) {
		ride.getPassenger().add(user);
		if (status == SeatStatus.RESERVE) ride.decrement();
		else if ( status == SeatStatus.CANCEL || status == SeatStatus.AVAILABLE) ride.increment();	
		
	}
	
}
