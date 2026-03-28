package com.busticket.dto.ResponseDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusDTO {

    private Integer busId;
    private Integer officeId;   // AgencyOffice ka ID
    private String registrationNumber;
    private Integer capacity;
    private String type;
}