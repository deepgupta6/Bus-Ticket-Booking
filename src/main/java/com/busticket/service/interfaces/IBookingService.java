package com.busticket.service.interfaces;

import com.busticket.entity.Booking;
import java.util.List;

public interface IBookingService {
    List<Booking> getAllBookings();

    Booking getBookingByID(long id);

    List<Booking> getBookingByTripID(long id);

    int numberOfSeatsBookedByTripID(long id);

}
