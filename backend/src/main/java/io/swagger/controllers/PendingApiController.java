package io.swagger.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.api.PendingApi;
import io.swagger.model.PlaceModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-15T06:02:20.320+02:00")

@RestController
public class PendingApiController implements PendingApi {

	private static final Logger log = LoggerFactory.getLogger(PendingApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public PendingApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<List<PlaceModel>> allPending(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<List<PlaceModel>>(objectMapper.readValue("[ {  \"locationY\" : 1.46581298050294517310021547018550336360931396484375,  \"address\" : \"address\",  \"locationX\" : 6.02745618307040320615897144307382404804229736328125,  \"name\" : \"name\",  \"id\" : 0.80082819046101150206595775671303272247314453125}, {  \"locationY\" : 1.46581298050294517310021547018550336360931396484375,  \"address\" : \"address\",  \"locationX\" : 6.02745618307040320615897144307382404804229736328125,  \"name\" : \"name\",  \"id\" : 0.80082819046101150206595775671303272247314453125} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<List<PlaceModel>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<List<PlaceModel>>(HttpStatus.NOT_IMPLEMENTED);
	}

}
