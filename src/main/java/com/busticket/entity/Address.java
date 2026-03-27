package com.busticket.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "addresses")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    private String address;
    private String city;
    private String state;
    private String zipCode;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
    private List<Customer> customers;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
    private List<AgencyOffice> offices;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
    private List<Driver> drivers;
}