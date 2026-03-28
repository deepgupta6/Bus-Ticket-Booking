// PaymentResponse.java
package com.busticket.dto.response;

import com.busticket.entity.enums.PaymentStatus;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class PaymentResponse {

    private Integer paymentId;

    // Booking summary
    private Long bookingId;
    private Integer seatNumber;
    private String bookingStatus;

    // Trip summary (via booking)
    private Long tripId;
    private String fromCity;
    private String toCity;
    private LocalDateTime departureTime;

    // Customer summary
    private Long customerId;
    private String customerName;
    private String customerEmail;

    private Double amount;
    private LocalDateTime paymentDate;
    private PaymentStatus paymentStatus;
}