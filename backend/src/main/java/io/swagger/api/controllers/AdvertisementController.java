package io.swagger.api.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.api.api.AdApi;
import io.swagger.entities.Advertisement;
import io.swagger.model.AdvertisementCreationDTO;
import io.swagger.services.AdvertisementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-05T23:15:12.065+02:00")

@RestController
//@RequiredArgsConstructor
public class AdvertisementController implements AdApi {

	private static final Logger log = LoggerFactory.getLogger(AdvertisementController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	private final AdvertisementService advertisementService;

	@org.springframework.beans.factory.annotation.Autowired
	public AdvertisementController(ObjectMapper objectMapper, HttpServletRequest request, AdvertisementService advertisementService) {
		this.advertisementService = advertisementService;
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Void> advertisementCreate(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "Advertisement creation body", required = true) @Valid @RequestBody AdvertisementCreationDTO body) {
		String accept = request.getHeader("Accept");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<List<Advertisement>> allAdvertisements() {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			List<Advertisement> ads = advertisementService.getAllAdvertisements();
			return new ResponseEntity<List<Advertisement>>(ads, HttpStatus.NOT_IMPLEMENTED);
		}

		return new ResponseEntity<List<Advertisement>>(HttpStatus.NOT_IMPLEMENTED);
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

	@PostMapping(value = "/create/ad", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Advertisement> createAdvertisement(@RequestBody AdvertisementCreationDTO adDTO) {
		Advertisement ad = advertisementService.createAdvertisement(adDTO);
		return ResponseEntity.ok(ad);
	}
}
