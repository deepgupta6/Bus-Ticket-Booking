package com.busticket.service.impl;

import com.busticket.dto.response.BookingResponse;
import com.busticket.entity.Booking;
import com.busticket.entity.Payment;
import com.busticket.entity.enums.BookingStatus;
import com.busticket.mapper.response.BookingResponseMapper;
import com.busticket.respository.IBookingRepo;
import com.busticket.respository.IPaymentRepo;
import com.busticket.service.interfaces.IBookingService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingServiceImpl implements IBookingService {

    private final IBookingRepo bookingRepo;
    private final IPaymentRepo paymentRepo;

    public BookingServiceImpl(IBookingRepo bookingRepo, IPaymentRepo paymentRepo) {
        this.bookingRepo = bookingRepo;
        this.paymentRepo = paymentRepo;
    }

    @Override
    public List<BookingResponse> getAllBookings() {
        return bookingRepo.findAll().stream()
                .map(booking -> {
                    Payment payment = paymentRepo.findByBooking_BookingId(booking.getBookingId()).orElse(null);
                    return BookingResponseMapper.entityToResponse(booking, payment);
                })
                .collect(Collectors.toList());
    }

    @Override
    public BookingResponse getBookingByID(Integer id) {
        Booking booking = bookingRepo.findById(id).orElse(null);
        Payment payment = paymentRepo.findByBooking_BookingId(id).orElse(null);
        return BookingResponseMapper.entityToResponse(booking, payment);
    }

    @Override
    public List<BookingResponse> getBookingByTripID(Integer id) {
        return bookingRepo.findByTrip_TripId(id).stream()
                .map(booking -> {
                    Payment payment = paymentRepo.findByBooking_BookingId(booking.getBookingId()).orElse(null);
                    return BookingResponseMapper.entityToResponse(booking, payment);
                })
                .collect(Collectors.toList());
    }

    @Override
    public int numberOfSeatsBookedByTripID(Integer id) {
        return bookingRepo.findByTrip_TripIdAndStatus(id, BookingStatus.Booked).size();
    }

}
