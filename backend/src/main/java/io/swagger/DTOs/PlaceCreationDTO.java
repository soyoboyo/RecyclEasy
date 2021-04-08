package io.swagger.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PlaceCreationData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-05T23:15:12.065+02:00")


public class PlaceCreationDTO {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("address")
	private String address = null;

	@JsonProperty("locationX")
	private String locationX = null;

	@JsonProperty("locationY")
	private String locationY = null;

	@JsonProperty("phone")
	private String phone = null;

	@JsonProperty("opensAt")
	private String opensAt = null;

	@JsonProperty("closesAt")
	private String closesAt = null;

	@JsonProperty("garbageTypes")
	@Valid
	private List<String> garbageTypes = null;

	public PlaceCreationDTO name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 *
	 * @return name
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PlaceCreationDTO address(String address) {
		this.address = address;
		return this;
	}

	/**
	 * Get address
	 *
	 * @return address
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public PlaceCreationDTO locationX(String locationX) {
		this.locationX = locationX;
		return this;
	}

	/**
	 * Get locationX
	 *
	 * @return locationX
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull


	public String getLocationX() {
		return locationX;
	}

	public void setLocationX(String locationX) {
		this.locationX = locationX;
	}

	public PlaceCreationDTO locationY(String locationY) {
		this.locationY = locationY;
		return this;
	}

	/**
	 * Get locationY
	 *
	 * @return locationY
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull


	public String getLocationY() {
		return locationY;
	}

	public void setLocationY(String locationY) {
		this.locationY = locationY;
	}

	public PlaceCreationDTO phone(String phone) {
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

	public PlaceCreationDTO opensAt(String opensAt) {
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

	public PlaceCreationDTO closesAt(String closesAt) {
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

	public PlaceCreationDTO garbageTypes(List<String> garbageTypes) {
		this.garbageTypes = garbageTypes;
		return this;
	}

	public PlaceCreationDTO addGarbageTypesItem(String garbageTypesItem) {
		if (this.garbageTypes == null) {
			this.garbageTypes = new ArrayList<String>();
		}
		this.garbageTypes.add(garbageTypesItem);
		return this;
	}

	/**
	 * Get garbageTypes
	 *
	 * @return garbageTypes
	 **/
	@ApiModelProperty(value = "")


	public List<String> getGarbageTypes() {
		return garbageTypes;
	}

	public void setGarbageTypes(List<String> garbageTypes) {
		this.garbageTypes = garbageTypes;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PlaceCreationDTO placeCreationData = (PlaceCreationDTO) o;
		return Objects.equals(this.name, placeCreationData.name) &&
				Objects.equals(this.address, placeCreationData.address) &&
				Objects.equals(this.locationX, placeCreationData.locationX) &&
				Objects.equals(this.locationY, placeCreationData.locationY) &&
				Objects.equals(this.phone, placeCreationData.phone) &&
				Objects.equals(this.opensAt, placeCreationData.opensAt) &&
				Objects.equals(this.closesAt, placeCreationData.closesAt) &&
				Objects.equals(this.garbageTypes, placeCreationData.garbageTypes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, address, locationX, locationY, phone, opensAt, closesAt, garbageTypes);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PlaceCreationData {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    address: ").append(toIndentedString(address)).append("\n");
		sb.append("    locationX: ").append(toIndentedString(locationX)).append("\n");
		sb.append("    locationY: ").append(toIndentedString(locationY)).append("\n");
		sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
		sb.append("    opensAt: ").append(toIndentedString(opensAt)).append("\n");
		sb.append("    closesAt: ").append(toIndentedString(closesAt)).append("\n");
		sb.append("    garbageTypes: ").append(toIndentedString(garbageTypes)).append("\n");
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

