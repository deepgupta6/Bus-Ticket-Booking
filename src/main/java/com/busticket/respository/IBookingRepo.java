package com.busticket.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.busticket.entity.Booking;

public interface IBookingRepo  extends JpaRepository<Booking, Long>{

}
