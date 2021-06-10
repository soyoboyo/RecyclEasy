package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PlaceFilterData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-15T06:02:20.320+02:00")


public class PlaceFilterData {
	@JsonProperty("city")
	private String city = null;

	@JsonProperty("garbageTypes")
	@Valid
	private List<String> garbageTypes = null;

	public PlaceFilterData city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * Get city
	 *
	 * @return city
	 **/
	@ApiModelProperty(value = "")


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public PlaceFilterData garbagetypes(List<String> garbagetypes) {
		this.garbageTypes = garbagetypes;
		return this;
	}

	public PlaceFilterData addGarbagetypesItem(String garbagetypesItem) {
		if (this.garbageTypes == null) {
			this.garbageTypes = new ArrayList<String>();
		}
		this.garbageTypes.add(garbagetypesItem);
		return this;
	}

	/**
	 * Get garbagetypes
	 *
	 * @return garbagetypes
	 **/
	@ApiModelProperty(value = "")


	public List<String> getGarbagetypes() {
		return garbageTypes;
	}

	public void setGarbagetypes(List<String> garbagetypes) {
		this.garbageTypes = garbagetypes;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PlaceFilterData placeFilterData = (PlaceFilterData) o;
		return Objects.equals(this.city, placeFilterData.city) &&
				Objects.equals(this.garbageTypes, placeFilterData.garbageTypes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, garbageTypes);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PlaceFilterData {\n");

		sb.append("    city: ").append(toIndentedString(city)).append("\n");
		sb.append("    garbagetypes: ").append(toIndentedString(garbageTypes)).append("\n");
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

	public String getConcatGarbageTypes() {
		return String.join(",", garbageTypes);
	}
}

