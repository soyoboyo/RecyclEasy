/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.ChangePasswordData;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-15T06:02:20.320+02:00")

@Validated
@Api(value = "changePassword", description = "the changePassword API")
@RequestMapping(value = "")
public interface ChangePasswordApi {

	@ApiOperation(value = "Change user password", nickname = "changePassword", notes = "", authorizations = {
			@Authorization(value = "recycleasy_auth", scopes = {
					@AuthorizationScope(scope = "read", description = "read data"),
					@AuthorizationScope(scope = "write", description = "modify data")
			})
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Password has been hanged"),
			@ApiResponse(code = 400, message = "Password is not strong. Passwords are not the same"),
			@ApiResponse(code = 403, message = "Only admin has access to this operation.")})
	@RequestMapping(value = "/changePassword",
			produces = {"application/json"},
			consumes = {"application/json"},
			method = RequestMethod.PUT)
	ResponseEntity<Void> changePassword(@ApiParam(value = "Authorization header", required = true) @RequestHeader(value = "Authorization", required = true) String authorization, @ApiParam(value = "New password in duplicate", required = true) @Valid @RequestBody ChangePasswordData body);

}
