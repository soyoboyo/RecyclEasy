package io.swagger.DTOs;

import lombok.Data;

@Data
public class PlaceCreationDTO {

	private final String name;
	private final String address;
	private final Float latitude;
	private final Float longitude;

}
