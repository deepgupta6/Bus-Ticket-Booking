package com.busticket.dto.ResponseDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgencyOfficeDTO {

    private Integer officeId;
    private String officeMail;
    private String officeContactPersonName;
    private String officeContactNumber;

    // Only IDs for relations
    private Integer agencyId;
    private Long addressId;
}