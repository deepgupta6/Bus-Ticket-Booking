package com.busticket.service.impl;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.busticket.dto.response.DriverTripSummaryResponse;
import com.busticket.dto.response.TripResponse;
import com.busticket.mapper.response.TripResponseMapper;
import com.busticket.respository.ITripRepo;
import com.busticket.service.interfaces.ITripService;

@Service
public class TripServiceImpl implements ITripService {
	private final ITripRepo repo;

	public TripServiceImpl(ITripRepo repo) {
		this.repo = repo;
	}

	@Override
	public List<TripResponse> getTripsWithAvailableSeats( int val) {

		return repo.findByAvailableSeatsGreaterThan(val).stream().map(e -> TripResponseMapper.entityToResponse(e))
				.toList();
	}

	@Override
	public TripResponse getTripById(int id) {

		return TripResponseMapper.entityToResponse(repo.findById(id).get());
	}
	
	@Override
	public List<DriverTripSummaryResponse> getCompletedTrips(
            String fromCity,
            String toCity
    ) {
		List<DriverTripSummaryResponse> list1 = repo.getTripsByDriver1(fromCity, toCity);
		List<DriverTripSummaryResponse> list2 = repo.getTripsByDriver2(fromCity, toCity);

		 List<DriverTripSummaryResponse> result = Stream.concat(list1.stream(), list2.stream())
		        .toList();
		 return result;
    }

}
