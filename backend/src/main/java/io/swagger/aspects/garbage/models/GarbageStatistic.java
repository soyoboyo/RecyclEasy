package io.swagger.aspects.garbage.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class GarbageStatistic {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@CreationTimestamp
	private Date timestamp;
	private String uuid = UUID.randomUUID().toString();
	private String city;
	private String garbageTypes;

	public GarbageStatistic(String city, String garbageTypes) {
		this.city = city;
		this.garbageTypes = garbageTypes;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		return uuid.equals(((GarbageStatistic) o).uuid);
	}

	@Override
	public int hashCode() {
		return Objects.hash(uuid);
	}

}
