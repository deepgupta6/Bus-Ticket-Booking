package com.busticket.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @NotNull
    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @NotNull
    @Column(name = "email", length = 255)
    private String email;

    @NotNull
    @Column(name = "phone", length = 15)
    private String phone;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
}