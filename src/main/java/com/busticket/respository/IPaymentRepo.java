package com.busticket.respository;

import com.busticket.dto.response.CustomerBookingPaymentResponse;
import com.busticket.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPaymentRepo extends JpaRepository<Payment, Integer> {
    public Optional<Payment> findByBooking_BookingId(Integer bookingId);
    
    @Query("""
            SELECT new com.busticket.dto.response.CustomerBookingPaymentResponse(
                c.name,
                c.email,
                b.bookingId,
                b.seatNumber,
                t.tripId,
                p.amount,
                p.paymentStatus
            )
            FROM Payment p
            JOIN p.customer c
            JOIN p.booking b
            JOIN b.trip t
        """)
      public  List<CustomerBookingPaymentResponse> getCustomerBookingPayments();
}
