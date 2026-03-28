package com.busticket.mapper;

import com.busticket.dto.ResponseDTO.TripDTO;
import com.busticket.entity.*;

public class TripMapper {

    public static TripDTO toDTO(Trip trip) {
        TripDTO dto = new TripDTO();
        dto.setTripId(trip.getTripId());
        dto.setRouteId(trip.getRoute().getRouteId());
        dto.setBusId(trip.getBus().getBusId());
        dto.setBoardingAddressId(trip.getBoardingAddress().getAddressId());
        dto.setDroppingAddressId(trip.getDroppingAddress().getAddressId());
        dto.setDriver1Id(trip.getDriver1().getDriverId());
        dto.setDriver2Id(trip.getDriver2().getDriverId());
        dto.setDepartureTime(trip.getDepartureTime());
        dto.setArrivalTime(trip.getArrivalTime());
        dto.setAvailableSeats(trip.getAvailableSeats());
        dto.setFare(trip.getFare());
        dto.setTripDate(trip.getTripDate());
        return dto;
    }

    public static Trip toEntity(TripDTO dto,
                                Route route,
                                Bus bus,
                                Address boardingAddress,
                                Address droppingAddress,
                                Driver driver1,
                                Driver driver2) {

        Trip trip = new Trip();
        trip.setTripId(dto.getTripId());
        trip.setRoute(route);
        trip.setBus(bus);
        trip.setBoardingAddress(boardingAddress);
        trip.setDroppingAddress(droppingAddress);
        trip.setDriver1(driver1);
        trip.setDriver2(driver2);
        trip.setDepartureTime(dto.getDepartureTime());
        trip.setArrivalTime(dto.getArrivalTime());
        trip.setAvailableSeats(dto.getAvailableSeats());
        trip.setFare(dto.getFare());
        trip.setTripDate(dto.getTripDate());
        return trip;
    }
}
