package com.busticket.controller;

import com.busticket.dto.response.BookingResponse;
import com.busticket.service.interfaces.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final IBookingService bookingService;

    @Autowired
    public BookingController(IBookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/")
    public ResponseEntity<List<BookingResponse>> getAllBookings() {
        return ResponseEntity.ok(bookingService.getAllBookings());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookingResponse> getBookingById(@PathVariable long id) {
        return ResponseEntity.ok(bookingService.getBookingByID(id));
    }

    @GetMapping("/trip/{tripId}")
    public ResponseEntity<List<BookingResponse>> getBookingsByTripId(@PathVariable long tripId) {
        return ResponseEntity.ok(bookingService.getBookingByTripID(tripId));
    }

    @GetMapping("/trip/{tripId}/booked-seats")
    public ResponseEntity<Integer> getNumberOfBookedSeats(@PathVariable long tripId) {
        return ResponseEntity.ok(bookingService.numberOfSeatsBookedByTripID(tripId));
    }
}
