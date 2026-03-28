package com.busticket.dto.ResponseDTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReviewDTO {

    private Long reviewId;

    private Long customerId;
    private Long tripId;

    private Integer rating;
    private String comment;
    private LocalDateTime reviewDate;
}