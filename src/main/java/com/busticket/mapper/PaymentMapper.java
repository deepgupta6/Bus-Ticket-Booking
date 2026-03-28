package com.busticket.mapper;

import com.busticket.dto.ResponseDTO.PaymentDTO;
import com.busticket.entity.Booking;
import com.busticket.entity.Customer;
import com.busticket.entity.Payment;

public class PaymentMapper {

    public static PaymentDTO toDTO(Payment payment) {
        PaymentDTO dto = new PaymentDTO();
        dto.setPaymentId(payment.getPaymentId());
        dto.setBookingId(payment.getBooking().getBookingId());
        dto.setCustomerId(payment.getCustomer().getCustomerId());
        dto.setAmount(payment.getAmount());
        dto.setPaymentDate(payment.getPaymentDate());
        dto.setPaymentStatus(payment.getPaymentStatus());
        return dto;
    }

    public static Payment toEntity(PaymentDTO dto, Booking booking, Customer customer) {
        Payment payment = new Payment();
        payment.setPaymentId(dto.getPaymentId());
        payment.setBooking(booking);
        payment.setCustomer(customer);
        payment.setAmount(dto.getAmount());
        payment.setPaymentDate(dto.getPaymentDate());
        payment.setPaymentStatus(dto.getPaymentStatus());
        return payment;
    }
}