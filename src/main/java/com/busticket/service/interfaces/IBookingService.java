package com.busticket.service.interfaces;

import com.busticket.dto.response.BookingResponse;

import java.util.List;

public interface IBookingService {
    public List<BookingResponse> getAllBookings();

    public BookingResponse getBookingByID(Integer id);

    public List<BookingResponse> getBookingByTripID(Integer id);

    public int numberOfSeatsBookedByTripID(Integer id);

}
