package com.metro.connect.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.metro.connect.dto.CommonApiResponse;
import com.metro.connect.dto.LocationResponseDto;
import com.metro.connect.entity.Location;
import com.metro.connect.resource.LocationResource;

@RestController
@RequestMapping("api/location/")
@CrossOrigin(origins = "http://localhost:3000")
public class LocationController {


private  static final Logger logger = LoggerFactory.getLogger(LocationController.class);

	
	@Autowired
	private LocationResource locationResource;
	
	@PostMapping("/add")
	public ResponseEntity<CommonApiResponse> addUserLocation(@RequestBody Location location) {

		// add the logger here
		System.out.println("request");

		return locationResource.addLocation(location);

	}

	@GetMapping("/fetch")
	public ResponseEntity<LocationResponseDto> getLocationById(@RequestParam("locationId") int locatonId) {

		// add the logger here
		logger.info("locationId: {} ",locatonId);
		System.out.println("request");

		return locationResource.getLocationById(locatonId);

	}
	
	@GetMapping("/all")
	public ResponseEntity<LocationResponseDto> getAllLocation() {

		// add the logger here
		System.out.println("request");

		return locationResource.getAllLocation();

	}
	
	@PutMapping("/update")
	public ResponseEntity<CommonApiResponse> updateLocation(@RequestBody Location location) {

		// add the logger here
		System.out.println("request");

		return locationResource.updateLocation(location);

	}

	@DeleteMapping("/delete")
	public ResponseEntity<CommonApiResponse> deleteLocation(@RequestParam("locatonId") int locatonId) {

		// add the logger here
		System.out.println("request");

		return locationResource.deleteLocationById(locatonId);

	}
	
	@GetMapping("/search")
	public ResponseEntity<LocationResponseDto> searchLocation(@RequestParam("locationName") String locationName) {

		// add the logger here
		System.out.println("request came for search locations");

		return locationResource.searchLocationsByName(locationName);

	}
	

}
