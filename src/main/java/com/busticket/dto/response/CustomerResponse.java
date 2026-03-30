// CustomerResponse.java
package com.busticket.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerResponse {

    private Integer customerId;
    private String name;
    private String email;
    private String phone;
    private AddressResponse address;    // full address object in response
}