package com.busticket.dto;

import java.time.LocalDateTime;

import com.busticket.entity.enums.PaymentStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentDTO {

    private Integer paymentId;

    private Long bookingId;
    private Long customerId;

    private Double amount;
    private LocalDateTime paymentDate;

    private PaymentStatus paymentStatus;
}