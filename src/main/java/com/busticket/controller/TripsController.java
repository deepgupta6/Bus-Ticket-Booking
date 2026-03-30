package com.busticket.controller;

import com.busticket.dto.response.TripFullDetailsResponse;
import com.busticket.service.interfaces.ITripService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/trips")
@RequiredArgsConstructor
public class TripsController {

    private final ITripService tripService;

    @GetMapping("/{tripId}")
    public ResponseEntity<TripFullDetailsResponse> getTripById(
            @PathVariable Integer tripId) {

        TripFullDetailsResponse trip = tripService.getTripById(tripId);

        return ResponseEntity.ok(trip);
    }
}