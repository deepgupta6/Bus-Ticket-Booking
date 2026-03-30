package com.busticket.service.interfaces;

import com.busticket.dto.response.BookingResponse;

import java.util.List;

public interface IBookingService {
    List<BookingResponse> getAllBookings();

    BookingResponse getBookingByID(Integer id);

    List<BookingResponse> getBookingByTripID(Integer id);

    int numberOfSeatsBookedByTripID(Integer id);

}
