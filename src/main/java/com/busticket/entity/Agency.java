package com.busticket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "agencies")
@Getter
@Setter
public class Agency {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer agencyId;
	private String name;
	private String contactPersonName;
	private String email;
	private String phone;
}
