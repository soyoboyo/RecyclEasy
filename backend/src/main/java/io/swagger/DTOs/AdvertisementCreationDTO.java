package io.swagger.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

/**
 * AdvertisementCreationData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-05T23:15:12.065+02:00")

@Data
//@NoArgsConstructor
//@RequiredArgsConstructor
public class AdvertisementCreationDTO {
	@JsonProperty("title")
	private String title = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("offerType")
	private String offerType = null;

	@JsonProperty("email")
	private String email = null;

	@JsonProperty("phone")
	private String phone = null;

}

