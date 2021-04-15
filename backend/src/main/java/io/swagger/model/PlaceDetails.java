package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * PlaceDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-15T06:02:20.320+02:00")


public class PlaceDetails {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("address")
	private String address = null;

	@JsonProperty("locationX")
	private BigDecimal locationX = null;

	@JsonProperty("locationY")
	private BigDecimal locationY = null;

	@JsonProperty("opensAt")
	private String opensAt = null;

	@JsonProperty("closesAt")
	private String closesAt = null;

	@JsonProperty("phone")
	private String phone = null;

	@JsonProperty("email")
	private String email = null;

	public PlaceDetails id(BigDecimal id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 *
	 * @return id
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public PlaceDetails name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 *
	 * @return name
	 **/
	@ApiModelProperty(value = "")


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PlaceDetails address(String address) {
		this.address = address;
		return this;
	}

	/**
	 * Get address
	 *
	 * @return address
	 **/
	@ApiModelProperty(value = "")


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public PlaceDetails locationX(BigDecimal locationX) {
		this.locationX = locationX;
		return this;
	}

	/**
	 * Get locationX
	 *
	 * @return locationX
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public BigDecimal getLocationX() {
		return locationX;
	}

	public void setLocationX(BigDecimal locationX) {
		this.locationX = locationX;
	}

	public PlaceDetails locationY(BigDecimal locationY) {
		this.locationY = locationY;
		return this;
	}

	/**
	 * Get locationY
	 *
	 * @return locationY
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public BigDecimal getLocationY() {
		return locationY;
	}

	public void setLocationY(BigDecimal locationY) {
		this.locationY = locationY;
	}

	public PlaceDetails opensAt(String opensAt) {
		this.opensAt = opensAt;
		return this;
	}

	/**
	 * Get opensAt
	 *
	 * @return opensAt
	 **/
	@ApiModelProperty(value = "")


	public String getOpensAt() {
		return opensAt;
	}

	public void setOpensAt(String opensAt) {
		this.opensAt = opensAt;
	}

	public PlaceDetails closesAt(String closesAt) {
		this.closesAt = closesAt;
		return this;
	}

	/**
	 * Get closesAt
	 *
	 * @return closesAt
	 **/
	@ApiModelProperty(value = "")


	public String getClosesAt() {
		return closesAt;
	}

	public void setClosesAt(String closesAt) {
		this.closesAt = closesAt;
	}

	public PlaceDetails phone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * Get phone
	 *
	 * @return phone
	 **/
	@ApiModelProperty(value = "")


	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public PlaceDetails email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Get email
	 *
	 * @return email
	 **/
	@ApiModelProperty(value = "")


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PlaceDetails placeDetails = (PlaceDetails) o;
		return Objects.equals(this.id, placeDetails.id) &&
				Objects.equals(this.name, placeDetails.name) &&
				Objects.equals(this.address, placeDetails.address) &&
				Objects.equals(this.locationX, placeDetails.locationX) &&
				Objects.equals(this.locationY, placeDetails.locationY) &&
				Objects.equals(this.opensAt, placeDetails.opensAt) &&
				Objects.equals(this.closesAt, placeDetails.closesAt) &&
				Objects.equals(this.phone, placeDetails.phone) &&
				Objects.equals(this.email, placeDetails.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, address, locationX, locationY, opensAt, closesAt, phone, email);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PlaceDetails {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    address: ").append(toIndentedString(address)).append("\n");
		sb.append("    locationX: ").append(toIndentedString(locationX)).append("\n");
		sb.append("    locationY: ").append(toIndentedString(locationY)).append("\n");
		sb.append("    opensAt: ").append(toIndentedString(opensAt)).append("\n");
		sb.append("    closesAt: ").append(toIndentedString(closesAt)).append("\n");
		sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

