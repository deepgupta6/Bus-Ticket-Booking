package com.busticket.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busticket.dto.response.AgencyOfficeWithResourcesDTO;
import com.busticket.service.interfaces.IAgencyOfficeService;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class AgencyOfficeController {

	private final IAgencyOfficeService agencyService;
	
	


	    @GetMapping("/agencies/offices/resources")
	    public ResponseEntity<List<AgencyOfficeWithResourcesDTO>> getAgencyOfficesWithResources() {

	        List<AgencyOfficeWithResourcesDTO> officesWithResources =
	                agencyService.getAgencyOfficesWithResources();

	        return ResponseEntity.ok(officesWithResources);
	    }
	}
	
	
