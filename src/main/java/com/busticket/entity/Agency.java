package com.busticket.entity;

import java.util.List;

import jakarta.persistence.*;
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

	@OneToMany(mappedBy = "agency", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<AgencyOffice> offices;
}