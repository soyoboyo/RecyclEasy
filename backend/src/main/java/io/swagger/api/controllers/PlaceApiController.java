package io.swagger.api.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.DTOs.PlaceCreationDTO;
import io.swagger.DTOs.PlaceUpdateDTO;
import io.swagger.annotations.ApiParam;
import io.swagger.api.api.PlaceApi;
import io.swagger.entities.Place;
import io.swagger.model.PlaceDetails;
import io.swagger.model.PlaceFilterData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-05T23:15:12.065+02:00")

@Controller
public class PlaceApiController implements PlaceApi {

	private static final Logger log = LoggerFactory.getLogger(PlaceApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public PlaceApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Void> approveSuggestion(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "ID of place suggestion", required = true) @PathVariable("suggestionId") BigDecimal suggestionId) {
		String accept = request.getHeader("Accept");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> createPlace(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "Place creation payload", required = true) @Valid @RequestBody PlaceCreationDTO body) {
		String accept = request.getHeader("Accept");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> deletePlace(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "ID of place to reove", required = true) @PathVariable("placeId") Long placeId) {
		String accept = request.getHeader("Accept");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<List<Place>> getAllPlaces() {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<List<Place>>(objectMapper.readValue("[ {  \"locationY\" : 1.46581298050294517310021547018550336360931396484375,  \"address\" : \"address\",  \"locationX\" : 6.02745618307040320615897144307382404804229736328125,  \"name\" : \"name\",  \"id\" : 0.80082819046101150206595775671303272247314453125}, {  \"locationY\" : 1.46581298050294517310021547018550336360931396484375,  \"address\" : \"address\",  \"locationX\" : 6.02745618307040320615897144307382404804229736328125,  \"name\" : \"name\",  \"id\" : 0.80082819046101150206595775671303272247314453125} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<List<Place>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<List<Place>>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Place> getFilteredPlaces(@ApiParam(value = "Place update payload", required = true) @Valid @RequestBody PlaceFilterData body) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<Place>(objectMapper.readValue("{  \"locationY\" : 1.46581298050294517310021547018550336360931396484375,  \"address\" : \"address\",  \"locationX\" : 6.02745618307040320615897144307382404804229736328125,  \"name\" : \"name\",  \"id\" : 0.80082819046101150206595775671303272247314453125}", Place.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<Place>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<Place>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<PlaceDetails> placeDetails(@ApiParam(value = "ID of place", required = true) @PathVariable("placeId") Long placeId) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<PlaceDetails>(objectMapper.readValue("{  \"locationY\" : 1.46581298050294517310021547018550336360931396484375,  \"address\" : \"address\",  \"phone\" : \"phone\",  \"locationX\" : 6.02745618307040320615897144307382404804229736328125,  \"name\" : \"name\",  \"opensAt\" : \"opensAt\",  \"id\" : 0.80082819046101150206595775671303272247314453125,  \"closesAt\" : \"closesAt\",  \"email\" : \"email\"}", PlaceDetails.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<PlaceDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<PlaceDetails>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> rejectSuggestion(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "ID of place suggestion", required = true) @PathVariable("suggestionId") BigDecimal suggestionId) {
		String accept = request.getHeader("Accept");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> sendSuggestion(@ApiParam(value = "Place creation payload", required = true) @Valid @RequestBody PlaceCreationDTO body) {
		String accept = request.getHeader("Accept");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> updatePlace(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "Place update payload", required = true) @Valid @RequestBody PlaceUpdateDTO body, @ApiParam(value = "ID of place to update", required = true) @PathVariable("placeId") Long placeId) {
		String accept = request.getHeader("Accept");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

}
