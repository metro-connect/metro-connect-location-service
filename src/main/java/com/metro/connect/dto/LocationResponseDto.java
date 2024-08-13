package com.metro.connect.dto;

import java.util.List;

import com.metro.connect.entity.Location;

public class LocationResponseDto extends CommonApiResponse {

	private List<Location> location;

	public List<Location> getLocation() {
		return location;
	}

	public void setLocation(List<Location> location) {
		this.location = location;
	}

}
