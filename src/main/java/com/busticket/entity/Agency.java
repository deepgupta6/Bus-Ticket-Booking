package com.busticket.entity;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
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
	@NotNull
	private String name;
	@NotNull
	private String contactPersonName;
	@Email
	private String email;
	@NotNull
	private String phone;

	
}