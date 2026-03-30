package com.busticket.respository;

import com.busticket.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface IPaymentRepo extends JpaRepository<Payment, Integer> {
    Optional<Payment> findByBooking_BookingId(Integer bookingId);
}
