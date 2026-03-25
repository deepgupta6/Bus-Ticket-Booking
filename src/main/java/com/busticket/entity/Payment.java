package com.busticket.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "payments")
@Getter @Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer paymentId;

    private Booking booking;

    private Customer customer;

    private Double amount;
    private LocalDateTime paymentDate;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
}