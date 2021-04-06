/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-05T23:15:12.065+02:00")

@Validated
@Api(value = "deleteAccount", description = "the deleteAccount API")
@RequestMapping(value = "")
public interface DeleteAccountApi {

	@ApiOperation(value = "Remove user account", nickname = "removeUserAccount", notes = "", authorizations = {
			@Authorization(value = "recycleasy_auth", scopes = {
					@AuthorizationScope(scope = "read", description = "read data"),
					@AuthorizationScope(scope = "write", description = "modify data")
			})
	}, tags = {"auth",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "User account has been removed"),
			@ApiResponse(code = 403, message = "Only admin has access to this operation.")})
	@RequestMapping(value = "/deleteAccount",
			produces = {"application/json"},
			consumes = {"application/json"},
			method = RequestMethod.DELETE)
	ResponseEntity<Void> removeUserAccount(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization);

}
