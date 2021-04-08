package io.swagger.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Place
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-05T23:15:12.065+02:00")

@Entity
public class Place {
	@JsonProperty("id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("address")
	private String address;

	@JsonProperty("locationX")
	private BigDecimal locationX;

	@JsonProperty("locationY")
	private BigDecimal locationY;

	public Place id(Long id) {
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Place name(String name) {
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

	public Place address(String address) {
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

	public Place locationX(BigDecimal locationX) {
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

	public Place locationY(BigDecimal locationY) {
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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Place place = (Place) o;
		return Objects.equals(this.id, place.id) &&
				Objects.equals(this.name, place.name) &&
				Objects.equals(this.address, place.address) &&
				Objects.equals(this.locationX, place.locationX) &&
				Objects.equals(this.locationY, place.locationY);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, address, locationX, locationY);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Place {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    address: ").append(toIndentedString(address)).append("\n");
		sb.append("    locationX: ").append(toIndentedString(locationX)).append("\n");
		sb.append("    locationY: ").append(toIndentedString(locationY)).append("\n");
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

