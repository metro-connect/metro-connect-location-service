package com.metro.connect.service;

import java.util.List;

import com.metro.connect.entity.Location;

public interface LocationService {
	
	Location addLocation(Location location);
	
	Location getLocationById(int location);
	
	List<Location> getAllActiveLocation(int status);

	Location udpateLocation(Location location);
	
	List<Location> searchLocationsByName(String locationName);
}
