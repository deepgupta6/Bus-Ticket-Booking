package com.busticket.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class TripDTO {

    private Long tripId;

    private Integer routeId;
    private Integer busId;

    private Long boardingAddressId;
    private Long droppingAddressId;

    private Integer driver1Id;
    private Integer driver2Id;

    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    private Integer availableSeats;
    private BigDecimal fare;
    private LocalDateTime tripDate;
}