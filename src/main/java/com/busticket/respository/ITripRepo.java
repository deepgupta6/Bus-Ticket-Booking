package com.busticket.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.busticket.entity.Trip;

public interface ITripRepo extends JpaRepository<Trip, Integer>{

}
