package com.busticket.respository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.busticket.entity.Trip;

import java.util.List;
import java.util.Optional;

public interface ITripRepo extends JpaRepository<Trip, Integer>{


	List<Trip> findByRoute_RouteId(Integer routeId);

    @EntityGraph(attributePaths = {"bus", "route"})
    Optional<Trip> findByTripId(Long tripId);
}

