package com.busticket.dto.response;

import lombok.Builder;
import lombok.Data;

// AddressResponse.java
@Data
@Builder
public class AddressResponse {

    private Integer addressId;
    private String address;
    private String city;
    private String state;
    private String zipCode;
}
