package com.busticket.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "trips")
@Getter @Setter
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tripId;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;

    @ManyToOne
    @JoinColumn(name = "boarding_address_id")
    private Address boardingAddress;

    @ManyToOne
    @JoinColumn(name = "dropping_address_id")
    private Address droppingAddress;

    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    @ManyToOne
    @JoinColumn(name = "driver1_driver_id")
    private Driver driver1;

    @ManyToOne
    @JoinColumn(name = "driver2_driver_id")
    private Driver driver2;

    private Integer availableSeats;
    private BigDecimal fare;
    private LocalDateTime tripDate;

    @OneToMany(mappedBy = "trip")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "trip")
    private List<Review> reviews;
}