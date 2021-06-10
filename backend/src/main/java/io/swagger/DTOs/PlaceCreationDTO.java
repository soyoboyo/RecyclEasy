package io.swagger.DTOs;

import lombok.Data;

import java.util.List;

@Data
public class PlaceCreationDTO {

	private final String name;
	private final String address;
	private final Float latitude;
	private final Float longitude;
	private final List<String> garbageTypes;
}
