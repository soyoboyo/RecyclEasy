package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * AdvertisementData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-15T06:02:20.320+02:00")


public class AdvertisementData {
	@JsonProperty("id")
	private BigDecimal id = null;

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

	public AdvertisementData id(BigDecimal id) {
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

	public AdvertisementData title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Get title
	 *
	 * @return title
	 **/
	@ApiModelProperty(value = "")


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public AdvertisementData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 *
	 * @return description
	 **/
	@ApiModelProperty(value = "")


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AdvertisementData offerType(String offerType) {
		this.offerType = offerType;
		return this;
	}

	/**
	 * Get offerType
	 *
	 * @return offerType
	 **/
	@ApiModelProperty(value = "")


	public String getOfferType() {
		return offerType;
	}

	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	public AdvertisementData email(String email) {
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

	public AdvertisementData phone(String phone) {
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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AdvertisementData advertisementData = (AdvertisementData) o;
		return Objects.equals(this.id, advertisementData.id) &&
				Objects.equals(this.title, advertisementData.title) &&
				Objects.equals(this.description, advertisementData.description) &&
				Objects.equals(this.offerType, advertisementData.offerType) &&
				Objects.equals(this.email, advertisementData.email) &&
				Objects.equals(this.phone, advertisementData.phone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, description, offerType, email, phone);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AdvertisementData {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

