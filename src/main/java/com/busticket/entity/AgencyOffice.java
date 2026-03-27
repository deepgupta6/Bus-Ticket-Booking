package com.busticket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
	@JoinColumn(name = "address_id")
	private Address address;
	

}
