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
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BookingServiceImpl implements IBookingService {

    private final IBookingRepo bookingRepo;
    private final IPaymentRepo paymentRepo;

    public BookingServiceImpl(IBookingRepo bookingRepo, IPaymentRepo paymentRepo) {
        this.bookingRepo = bookingRepo;
        this.paymentRepo = paymentRepo;
    }

    private Map<Integer, Payment> getPaymentMap(List<Booking> bookings) {
        List<Integer> bookingIds = bookings.stream()
                .map(Booking::getBookingId)
                .collect(Collectors.toList());
        return paymentRepo.findByBookingIds(bookingIds).stream()
                .collect(Collectors.toMap(p -> p.getBooking().getBookingId(), p -> p, (a, b) -> a));
    }

    @Override
    public List<BookingResponse> getAllBookings() {
        List<Booking> bookings = bookingRepo.findAll();
        Map<Integer, Payment> paymentMap = getPaymentMap(bookings);
        return bookings.stream()
                .map(b -> BookingResponseMapper.entityToResponse(b, paymentMap.get(b.getBookingId())))
                .collect(Collectors.toList());
    }

    @Override
    public BookingResponse getBookingByID(Integer id) {
        Booking booking = bookingRepo.findById(id).orElse(null);
        Payment payment = paymentRepo.findFirstByBooking_BookingId(id).orElse(null);
        return BookingResponseMapper.entityToResponse(booking, payment);
    }

    @Override
    public List<BookingResponse> getBookingByTripID(Integer id) {
        List<Booking> bookings = bookingRepo.findByTrip_TripId(id);
        Map<Integer, Payment> paymentMap = getPaymentMap(bookings);
        return bookings.stream()
                .map(b -> BookingResponseMapper.entityToResponse(b, paymentMap.get(b.getBookingId())))
                .collect(Collectors.toList());

    private Map<Long, Payment> getPaymentMap(List<Booking> bookings) {
        List<Long> ids = bookings.stream().map(Booking::getBookingId).toList();
        return paymentRepo.findByBookingIds(ids).stream()
                .collect(Collectors.toMap(
                        p -> p.getBooking().getBookingId(),
                        p -> p,
                        (existing, duplicate) -> existing
                ));
    }



    @Override
    public int numberOfSeatsBookedByTripID(Integer id) {
        return bookingRepo.findByTrip_TripIdAndStatus(id, BookingStatus.Booked).size();
    }
}
