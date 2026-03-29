package com.busticket.service.impl;

import com.busticket.entity.Booking;
import com.busticket.respository.IBookingRepo;
import com.busticket.service.interfaces.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements IBookingService {
    @Autowired
    private IBookingRepo bookingRepo;

    @Override
    public List<Booking> getAllBookings() {
        return  bookingRepo.findAll();
    }

    @Override
    public Booking getBookingByID(long id) {
        return null;
    }

}
