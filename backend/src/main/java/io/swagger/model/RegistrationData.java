package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * RegistrationData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-15T06:02:20.320+02:00")


public class RegistrationData {
	@JsonProperty("email")
	private String email = null;

	@JsonProperty("password")
	private String password = null;

	@JsonProperty("repeatPassword")
	private String repeatPassword = null;

	@JsonProperty("acceptRules")
	private Boolean acceptRules = null;

	public RegistrationData email(String email) {
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

	public RegistrationData password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get password
	 *
	 * @return password
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RegistrationData repeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
		return this;
	}

	/**
	 * Get repeatPassword
	 *
	 * @return repeatPassword
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull


	public String getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}

	public RegistrationData acceptRules(Boolean acceptRules) {
		this.acceptRules = acceptRules;
		return this;
	}

	/**
	 * Get acceptRules
	 *
	 * @return acceptRules
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull


	public Boolean isAcceptRules() {
		return acceptRules;
	}

	public void setAcceptRules(Boolean acceptRules) {
		this.acceptRules = acceptRules;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RegistrationData registrationData = (RegistrationData) o;
		return Objects.equals(this.email, registrationData.email) &&
				Objects.equals(this.password, registrationData.password) &&
				Objects.equals(this.repeatPassword, registrationData.repeatPassword) &&
				Objects.equals(this.acceptRules, registrationData.acceptRules);
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, password, repeatPassword, acceptRules);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RegistrationData {\n");

		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    repeatPassword: ").append(toIndentedString(repeatPassword)).append("\n");
		sb.append("    acceptRules: ").append(toIndentedString(acceptRules)).append("\n");
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

