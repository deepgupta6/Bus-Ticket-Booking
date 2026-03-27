package com.busticket.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {

    private Long addressId;
    private String address;
    private String city;
    private String state;
    private String zipCode;
}