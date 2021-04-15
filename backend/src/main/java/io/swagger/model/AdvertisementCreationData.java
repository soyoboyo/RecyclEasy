package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * AdvertisementCreationData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-15T06:02:20.320+02:00")


public class AdvertisementCreationData {
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

	public AdvertisementCreationData title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Get title
	 *
	 * @return title
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public AdvertisementCreationData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 *
	 * @return description
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AdvertisementCreationData offerType(String offerType) {
		this.offerType = offerType;
		return this;
	}

	/**
	 * Get offerType
	 *
	 * @return offerType
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull


	public String getOfferType() {
		return offerType;
	}

	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	public AdvertisementCreationData email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Get email
	 *
	 * @return email
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AdvertisementCreationData phone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * Get phone
	 *
	 * @return phone
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull


	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AdvertisementCreationData advertisementCreationData = (AdvertisementCreationData) o;
		return Objects.equals(this.title, advertisementCreationData.title) &&
				Objects.equals(this.description, advertisementCreationData.description) &&
				Objects.equals(this.offerType, advertisementCreationData.offerType) &&
				Objects.equals(this.email, advertisementCreationData.email) &&
				Objects.equals(this.phone, advertisementCreationData.phone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, description, offerType, email, phone);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AdvertisementCreationData {\n");

		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}

