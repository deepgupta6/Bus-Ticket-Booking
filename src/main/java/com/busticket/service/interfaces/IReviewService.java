package com.busticket.service.interfaces;

import com.busticket.entity.Review;

import java.util.List;

public interface IReviewService {
    List<Review> findAll();
    Review findReviewById(Integer id);
    List<Review> findReviewByCustomerId(Integer customerId);
    List<Review> findReviewByTripId(Integer reviewerId);
}
