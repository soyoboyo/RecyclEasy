/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-05T23:15:12.065+02:00")

@Validated
@Api(value = "resetPassword", description = "the resetPassword API")
@RequestMapping(value = "")
public interface ResetPasswordApi {

	@ApiOperation(value = "Reset password to the system", nickname = "resetPassowrd", notes = "", tags = {"auth",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Reset link has been sent to user's email."),
			@ApiResponse(code = 400, message = "User email not found.")})
	@RequestMapping(value = "/resetPassword",
			produces = {"application/json"},
			consumes = {"application/x-www-form-urlencoded", "application/json"},
			method = RequestMethod.PUT)
	ResponseEntity<Void> resetPassowrd(@ApiParam(value = "Account email", required = true) @RequestParam(value = "email", required = true) String email);

}
