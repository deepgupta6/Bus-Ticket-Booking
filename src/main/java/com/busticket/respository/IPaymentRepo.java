package com.busticket.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.busticket.entity.Payment;

public interface IPaymentRepo extends JpaRepository<Payment, Integer>{

}
