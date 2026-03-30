package com.busticket.respository;

import com.busticket.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPaymentRepo extends JpaRepository<Payment, Integer> {
    @Query("SELECT p FROM Payment p WHERE p.booking.bookingId IN :bookingIds")
    List<Payment> findByBookingIds(@Param("bookingIds") List<Long> bookingIds);
    Optional<Payment> findFirstByBooking_BookingId(Long bookingId);
}
