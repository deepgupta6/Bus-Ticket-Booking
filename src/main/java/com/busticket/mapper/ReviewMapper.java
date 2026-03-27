package com.busticket.mapper;

import com.busticket.dto.ReviewDTO;
import com.busticket.entity.Customer;
import com.busticket.entity.Review;
import com.busticket.entity.Trip;

public class ReviewMapper {

    public static ReviewDTO toDTO(Review review) {
        ReviewDTO dto = new ReviewDTO();
        dto.setReviewId(review.getReviewId());
        dto.setCustomerId(review.getCustomer().getCustomerId());
        dto.setTripId(review.getTrip().getTripId());
        dto.setRating(review.getRating());
        dto.setComment(review.getComment());
        dto.setReviewDate(review.getReviewDate());
        return dto;
    }

    public static Review toEntity(ReviewDTO dto, Customer customer, Trip trip) {
        Review review = new Review();
        review.setReviewId(dto.getReviewId());
        review.setCustomer(customer);
        review.setTrip(trip);
        review.setRating(dto.getRating());
        review.setComment(dto.getComment());
        review.setReviewDate(dto.getReviewDate());
        return review;
    }
}