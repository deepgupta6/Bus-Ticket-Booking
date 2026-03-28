package com.busticket.dto.ResponseDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDTO {

    private Long customerId;
    private String name;
    private String email;
    private String phone;

    // ManyToOne → only ID
    private Long addressId;
}