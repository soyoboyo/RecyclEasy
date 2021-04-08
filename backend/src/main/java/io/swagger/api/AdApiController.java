package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.entities.Place;
import io.swagger.model.AdvertisementCreationData;
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
public class AdApiController implements AdApi {

	private static final Logger log = LoggerFactory.getLogger(AdApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public AdApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Void> advertisementCreate(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "Advertisement creation body", required = true) @Valid @RequestBody AdvertisementCreationData body) {
		String accept = request.getHeader("Accept");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<List<Place>> allAdvertisements() {
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

	public ResponseEntity<Void> approveAd(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "ID of advertisement to approve", required = true) @PathVariable("advertisementId") BigDecimal advertisementId) {
		String accept = request.getHeader("Accept");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> deleteAdvertisement(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "Advertisement to delete.", required = true) @PathVariable("advertsiementId") BigDecimal advertsiementId) {
		String accept = request.getHeader("Accept");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> rejectAd(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "ID of advertisement to reject", required = true) @PathVariable("advertisementId") BigDecimal advertisementId) {
		String accept = request.getHeader("Accept");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> updateAdvertisement(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "Advertisement to modify.", required = true) @PathVariable("advertisementId") BigDecimal advertisementId) {
		String accept = request.getHeader("Accept");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

}
