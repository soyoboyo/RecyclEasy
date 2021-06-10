package io.swagger.aspects;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface StatisticsApi {

	@ApiOperation(value = "Get aggregated statistics", nickname = "getStatistics", authorizations = {
			@Authorization(value = "petstore_auth", scopes = {
					@AuthorizationScope(scope = "read", description = "read data")
			})})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success. List of statistics given.", response = AggregatedStatistic.class, responseContainer = "List"),
			@ApiResponse(code = 401, message = "User not logged in"),
			@ApiResponse(code = 403, message = "User does not have access to this application")})
	@RequestMapping(value = "/aggregated",
			produces = {"application/json"},
			method = RequestMethod.GET)
	ResponseEntity<List<AggregatedStatistic>> getStatistics();

}
