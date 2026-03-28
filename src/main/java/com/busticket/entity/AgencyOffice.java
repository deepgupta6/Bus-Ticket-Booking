package com.busticket.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "agency_offices")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AgencyOffice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer officeId;

	@ManyToOne
	@JoinColumn(name = "agency_id")
	private Agency agency;
	@Email
	private String officeMail;
	@NotNull
	private String officeContactPersonName;
	@NotNull
	private String officeContactNumber;

	@ManyToOne
	@JoinColumn(name = "office_address_id")
	private Address address;
}