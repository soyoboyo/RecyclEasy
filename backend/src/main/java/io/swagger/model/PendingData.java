package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PendingData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-05T23:15:12.065+02:00")


public class PendingData {
	@JsonProperty("pendingSuggestions")
	@Valid
	private List<PlaceCreationData> pendingSuggestions = null;

	@JsonProperty("pendingAdvertisements")
	@Valid
	private List<AdvertisementData> pendingAdvertisements = null;

	public PendingData pendingSuggestions(List<PlaceCreationData> pendingSuggestions) {
		this.pendingSuggestions = pendingSuggestions;
		return this;
	}

	public PendingData addPendingSuggestionsItem(PlaceCreationData pendingSuggestionsItem) {
		if (this.pendingSuggestions == null) {
			this.pendingSuggestions = new ArrayList<PlaceCreationData>();
		}
		this.pendingSuggestions.add(pendingSuggestionsItem);
		return this;
	}

	/**
	 * Get pendingSuggestions
	 *
	 * @return pendingSuggestions
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public List<PlaceCreationData> getPendingSuggestions() {
		return pendingSuggestions;
	}

	public void setPendingSuggestions(List<PlaceCreationData> pendingSuggestions) {
		this.pendingSuggestions = pendingSuggestions;
	}

	public PendingData pendingAdvertisements(List<AdvertisementData> pendingAdvertisements) {
		this.pendingAdvertisements = pendingAdvertisements;
		return this;
	}

	public PendingData addPendingAdvertisementsItem(AdvertisementData pendingAdvertisementsItem) {
		if (this.pendingAdvertisements == null) {
			this.pendingAdvertisements = new ArrayList<AdvertisementData>();
		}
		this.pendingAdvertisements.add(pendingAdvertisementsItem);
		return this;
	}

	/**
	 * Get pendingAdvertisements
	 *
	 * @return pendingAdvertisements
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public List<AdvertisementData> getPendingAdvertisements() {
		return pendingAdvertisements;
	}

	public void setPendingAdvertisements(List<AdvertisementData> pendingAdvertisements) {
		this.pendingAdvertisements = pendingAdvertisements;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PendingData pendingData = (PendingData) o;
		return Objects.equals(this.pendingSuggestions, pendingData.pendingSuggestions) &&
				Objects.equals(this.pendingAdvertisements, pendingData.pendingAdvertisements);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pendingSuggestions, pendingAdvertisements);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PendingData {\n");

		sb.append("    pendingSuggestions: ").append(toIndentedString(pendingSuggestions)).append("\n");
		sb.append("    pendingAdvertisements: ").append(toIndentedString(pendingAdvertisements)).append("\n");
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

