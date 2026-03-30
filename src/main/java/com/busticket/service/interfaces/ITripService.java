package com.busticket.service.interfaces;

import java.util.List;

import com.busticket.dto.response.DriverTripSummaryResponse;
import com.busticket.dto.response.TripResponse;

public interface ITripService {
	
	public List<TripResponse> getTripsWithAvailableSeats(int val);
	public TripResponse getTripById(int id);
	public List<DriverTripSummaryResponse> getCompletedTrips(
            String fromCity,
            String toCity
    );

}
