package io.swagger.DTOs.requests;

import lombok.Data;

import java.util.List;

@Data
public class PlaceFilteredDTO {
	private String city;
	private List<String> garbageTypes;
}
