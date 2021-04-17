/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.DTOs.AdvertisementCreationDTO;
import io.swagger.annotations.*;
import io.swagger.entities.Advertisement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-15T06:02:20.320+02:00")

@Validated
@Api(value = "advertisement", description = "the ad API")
@RequestMapping(value = "/advertisement")
public interface AdvertisementApi {

	@ApiOperation(value = "Create advertisement", nickname = "advertisementCreate", notes = "", authorizations = {
			@Authorization(value = "recycleasy_auth", scopes = {
					@AuthorizationScope(scope = "read", description = "read data"),
					@AuthorizationScope(scope = "write", description = "modify data")
			})
	}, tags = {"advertisement",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Advertisement create successfully."),
			@ApiResponse(code = 403, message = "Only admin has access to this operation.")})
	@RequestMapping(value = "/create",
			produces = {"application/json"},
			consumes = {"application/json", "application/x-www-form-urlencoded"},
			method = RequestMethod.POST)
	ResponseEntity<Advertisement> createAdvertisement(@Valid @RequestBody AdvertisementCreationDTO body);
//	ResponseEntity<Advertisement> createAdvertisement(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "Advertisement creation body", required = true) @Valid @RequestBody AdvertisementCreationData body);


	@ApiOperation(value = "Shows all published advertisements", nickname = "allAdvertisements", notes = "", response = Advertisement.class, responseContainer = "List", tags = {"advertisement",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "All published advertisements", response = Advertisement.class, responseContainer = "List")})
	@RequestMapping(value = "/getAll",
			produces = {"application/json"},
			consumes = {"application/json"},
			method = RequestMethod.GET)
	ResponseEntity<List<Advertisement>> allAdvertisements();


	@ApiOperation(value = "Approve advertisement with given ID.", nickname = "approveAd", notes = "", authorizations = {
			@Authorization(value = "recycleasy_auth", scopes = {
					@AuthorizationScope(scope = "read", description = "read data"),
					@AuthorizationScope(scope = "write", description = "modify data")
			})
	}, tags = {"admin",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Advertisement approved successfully."),
			@ApiResponse(code = 403, message = "Only admin has access to this operation."),
			@ApiResponse(code = 404, message = "Advertisement doesnt exist.")})
	@RequestMapping(value = "/approve/{advertisementId}",
			produces = {"application/json"},
			consumes = {"application/json", "application/x-www-form-urlencoded"},
			method = RequestMethod.POST)
	ResponseEntity<Void> approveAd(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "ID of advertisement to approve", required = true) @PathVariable("advertisementId") BigDecimal advertisementId);


	@ApiOperation(value = "Delete advertisement with given id", nickname = "deleteAdvertisement", notes = "", authorizations = {
			@Authorization(value = "recycleasy_auth", scopes = {
					@AuthorizationScope(scope = "read", description = "read data"),
					@AuthorizationScope(scope = "write", description = "modify data")
			})
	}, tags = {"advertisement",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Advertisement deleted successfully"),
			@ApiResponse(code = 403, message = "User not authorized."),
			@ApiResponse(code = 404, message = "Advertisment doesnt exist.")})
	@RequestMapping(value = "/delete/{advertsiementId}",
			produces = {"application/json"},
			consumes = {"application/json", "application/x-www-form-urlencoded"},
			method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteAdvertisement(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "Advertisement to delete.", required = true) @PathVariable("advertsiementId") Long advertsiementId);


	@ApiOperation(value = "Reject advertisement with given ID.", nickname = "rejectAd", notes = "", authorizations = {
			@Authorization(value = "recycleasy_auth", scopes = {
					@AuthorizationScope(scope = "read", description = "read data"),
					@AuthorizationScope(scope = "write", description = "modify data")
			})
	}, tags = {"admin",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Advertisement rejected successfully."),
			@ApiResponse(code = 403, message = "Only admin has access to this operation."),
			@ApiResponse(code = 404, message = "Advertisement doesnt exist.")})
	@RequestMapping(value = "/reject/{advertisementId}",
			produces = {"application/json"},
			consumes = {"application/json", "application/x-www-form-urlencoded"},
			method = RequestMethod.POST)
	ResponseEntity<Void> rejectAd(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "ID of advertisement to reject", required = true) @PathVariable("advertisementId") BigDecimal advertisementId);


	@ApiOperation(value = "Edit advertisement with given id", nickname = "updateAdvertisement", notes = "", authorizations = {
			@Authorization(value = "recycleasy_auth", scopes = {
					@AuthorizationScope(scope = "read", description = "read data"),
					@AuthorizationScope(scope = "write", description = "modify data")
			})
	}, tags = {"advertisement",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Advertisement updated successfully"),
			@ApiResponse(code = 403, message = "User not authorized."),
			@ApiResponse(code = 404, message = "Advertisement doesnt exist.")})
	@RequestMapping(value = "/update/{advertisementId}",
			produces = {"application/json"},
			consumes = {"application/json", "application/x-www-form-urlencoded"},
			method = RequestMethod.PUT)
	ResponseEntity<Void> updateAdvertisement(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "Advertisement to modify.", required = true) @PathVariable("advertisementId") BigDecimal advertisementId);

}