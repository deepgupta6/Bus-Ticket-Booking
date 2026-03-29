package com.busticket.service.interfaces;

import com.busticket.dto.response.BookingResponse;

import java.util.List;

public interface IBookingService {
    List<BookingResponse> getAllBookings();

    BookingResponse getBookingByID(long id);

    List<BookingResponse> getBookingByTripID(long id);

    int numberOfSeatsBookedByTripID(long id);

}
