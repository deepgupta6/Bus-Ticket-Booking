package com.busticket.service.impl;

import com.busticket.entity.Booking;
import com.busticket.entity.enums.BookingStatus;
import com.busticket.respository.IBookingRepo;
import com.busticket.service.interfaces.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingServiceImpl implements IBookingService {

    private final IBookingRepo bookingRepo;

    @Autowired
    public BookingServiceImpl(IBookingRepo bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }

    @Override
    public Booking getBookingByID(long id) {
        return null;
    }

    @Override
    public List<Booking> getBookingByTripID(long id) {
        return bookingRepo.findByTrip_TripId(id);
    }

    @Override
    public int numberOfSeatsBookedByTripID(long id) {
        return bookingRepo.findByTrip_TripIdAndStatus(id, BookingStatus.BOOKED).size();
    }

}
