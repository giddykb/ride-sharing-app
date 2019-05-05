package com.ride.sharing.app.strategy;

import java.util.List;

import com.ride.sharing.app.entities.Ride;

public interface SelectionStrategy {
	List<Ride> select();
}
