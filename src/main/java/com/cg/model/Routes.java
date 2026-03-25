package com.cg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="routes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Routes {
   
	@Id
	@NotNull
	private Integer route_id;
	private String from_city;
	private String to_city;
	private Integer break_points;
	private Integer duration;
	
	
	
}
