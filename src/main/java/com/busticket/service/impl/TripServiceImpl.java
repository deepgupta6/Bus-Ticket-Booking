package com.busticket.service.impl;

import com.busticket.dto.response.TripFullDetailsResponse;
import com.busticket.entity.Bus;
import com.busticket.entity.Driver;
import com.busticket.entity.Route;
import com.busticket.entity.Trip;
import com.busticket.exception.ResourceNotFoundException;
import com.busticket.mapper.response.TripMapper;
import com.busticket.respository.IBusRepo;
import com.busticket.respository.IDriverRepo;
import com.busticket.respository.IRouteRepo;
import com.busticket.respository.ITripRepo;
import com.busticket.service.interfaces.ITripService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class TripServiceImpl implements ITripService {

    private final ITripRepo tripRepository;

    private final TripMapper tripMapper;


    @Override
    @Transactional(readOnly = true)
    public TripFullDetailsResponse getTripById(Integer tripId) {

        Trip trip = tripRepository.findById(tripId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Trip not found with ID: " + tripId));


        Route route = trip.getRoute();
        Bus bus = trip.getBus();

        List<Driver> drivers = new ArrayList<>();
        if (trip.getDriver1() != null) drivers.add(trip.getDriver1());
        if (trip.getDriver2() != null) drivers.add(trip.getDriver2());


        return tripMapper.tripToFullDetailsResponse(trip, route, bus, drivers);
    }


}


