package com.busticket.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "agency_offices")
@Getter
@Setter
public class AgencyOffice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer officeId;

	@ManyToOne
	@JoinColumn(name = "agency_id")
	private Agency agency;

	private String officeMail;
	private String officeContactPersonName;
	private String officeContactNumber;

	@ManyToOne
	@JoinColumn(name = "office_address_id")
	private Address address;
}