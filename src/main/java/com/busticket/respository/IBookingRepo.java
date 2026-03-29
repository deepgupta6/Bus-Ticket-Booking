package com.busticket.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.busticket.entity.Booking;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookingRepo  extends JpaRepository<Booking, Long>{

}
