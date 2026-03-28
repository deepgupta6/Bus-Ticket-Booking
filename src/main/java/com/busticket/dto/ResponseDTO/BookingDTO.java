package com.busticket.dto.ResponseDTO;

import com.busticket.entity.enums.BookingStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingDTO {

    private Long bookingId;
    private Long tripId;
    private Integer seatNumber;
    private BookingStatus status;
}