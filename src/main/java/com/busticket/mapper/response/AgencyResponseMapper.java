package com.busticket.mapper.response;

import com.busticket.dto.response.AgencyResponse;
import com.busticket.entity.Agency;

public class AgencyResponseMapper {

    public static AgencyResponse entityToResponse(Agency agency) {
        return AgencyResponse.builder()
                .agencyId(agency.getAgencyId())
                .name(agency.getName())
                .contactPersonName(agency.getContactPersonName())
                .email(agency.getEmail())
                .phone(agency.getPhone())
                .build();
    }

    public static Agency responseToEntity(AgencyResponse response) {
        Agency agency = new Agency();
        agency.setAgencyId(response.getAgencyId());
        agency.setName(response.getName());
        agency.setContactPersonName(response.getContactPersonName());
        agency.setEmail(response.getEmail());
        agency.setPhone(response.getPhone());
        return agency;
    }
}
