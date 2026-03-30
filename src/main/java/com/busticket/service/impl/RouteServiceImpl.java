package com.busticket.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.busticket.dto.response.RouteWithTripsDTO;
import com.busticket.entity.Route;
import com.busticket.entity.Trip;
import com.busticket.mapper.response.RouteResponseMapper;
import com.busticket.mapper.response.RouteWithTripsResponseMapper;
import com.busticket.respository.IRouteRepo;
import com.busticket.respository.ITripRepo;
import com.busticket.service.interfaces.IRouteService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RouteServiceImpl implements IRouteService {

    private final IRouteRepo routeRepository;
    private final ITripRepo tripRepository;
    private final RouteWithTripsResponseMapper routeResponseMapper;

    @Override
    public RouteWithTripsDTO getRouteWithTrips(Integer routeId) {

        Route route = routeRepository.findById(routeId)
                .orElseThrow(() -> new RuntimeException("Route not found")); 

        List<Trip> trips = tripRepository.findByRoute_RouteId(routeId);

        return routeResponseMapper.routeWithTripsToResponse(route, trips);
    }
}