package com.busticket.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.busticket.dto.response.DriverTripSummaryResponse;
import com.busticket.dto.response.TripResponse;
import com.busticket.service.interfaces.ITripService;

@RestController
@RequestMapping("/api/trips")
public class TripsController {

	private final ITripService service;

	public TripsController(ITripService service) {
		this.service = service;
	}

	@GetMapping("/{id}")
	public ResponseEntity<TripResponse> getTripById(@PathVariable int id) {
		return new ResponseEntity<TripResponse>(service.getTripById(id), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<TripResponse>> getTripsWithAvailableSeats() {
	    List<TripResponse> trips = service.getTripsWithAvailableSeats(0);
	    return ResponseEntity.ok(trips);
	}

    @GetMapping("/completed")
    public List<DriverTripSummaryResponse> getCompletedTrips(
            @RequestParam String fromCity,
            @RequestParam String toCity
    ) {
        return service.getCompletedTrips(fromCity, toCity);
    }

}
