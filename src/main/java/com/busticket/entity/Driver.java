package com.busticket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer driver_id;
	private String license_number;
	private String name;
	private String phone;
	private AgencyOffices agencyOffice;
	private Address address;

}
