package com.metro.connect.service;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metro.connect.dao.LocationDao;
import com.metro.connect.entity.Location;

@Service
@Slf4j
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationDao departmentDao;

	@Override
	public Location addLocation(Location location) {
		return departmentDao.save(location);
	}

	@Override
	public Location getLocationById(int departmentId) {
		log.info("inside getLocationById : {}",departmentId);
		return departmentDao.findById(departmentId).get();
	}

	@Override
	public List<Location> getAllActiveLocation(int status) {
		return departmentDao.findByStatus(status);
	}

	@Override
	public Location udpateLocation(Location location) {
		return departmentDao.save(location);
	}

	@Override
	public List<Location> searchLocationsByName(String locationName) {
		return departmentDao.findByNameContainingIgnoreCase(locationName);
	}

}
