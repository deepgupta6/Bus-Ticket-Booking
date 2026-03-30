package com.busticket.respository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.busticket.entity.Trip;

import java.util.Optional;

public interface ITripRepo extends JpaRepository<Trip, Integer> {

    @EntityGraph(attributePaths = {"bus", "route"})
    Optional<Trip> findByTripId(Long tripId);
}

