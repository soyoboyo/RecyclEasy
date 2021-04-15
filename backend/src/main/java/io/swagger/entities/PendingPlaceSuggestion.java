package io.swagger.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PendingPlaceSuggestion {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
}
