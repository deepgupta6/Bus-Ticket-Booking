package com.busticket.respository;

import com.busticket.entity.Booking;
import com.busticket.entity.enums.BookingStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IBookingRepo extends JpaRepository<Booking, Integer> {

    List<Booking> findByTrip_TripId(Integer id);

    List<Booking> findByTrip_TripIdAndStatus(Integer id, BookingStatus status);

}
