package com.busticket.service.interfaces;

import com.busticket.entity.Review;

import java.util.List;

public interface IReviewService {
    List<Review> findAll();
    Review findReviewById(long id);
    List<Review> findReviewByCustomerId(long customerId);
    List<Review> findReviewByTripId(long reviewerId);
}
