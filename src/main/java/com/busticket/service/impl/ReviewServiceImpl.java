package com.busticket.service.impl;

import com.busticket.entity.Review;
import com.busticket.respository.IReviewRepo;
import com.busticket.service.interfaces.IReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements IReviewService {

    private final IReviewRepo reviewRepo;
   
    public ReviewServiceImpl(IReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @Override
    public List<Review> findAll() {
        return reviewRepo.findAll();
    }

    @Override
    public Review findReviewById(Integer id) {
        Optional<Review> op=reviewRepo.findById(id);
        return op.orElse(null);
    }

    @Override
    public List<Review> findReviewByCustomerId(Integer customerId) {
        return reviewRepo.findByCustomer_CustomerId(customerId);
    }

    @Override
    public List<Review> findReviewByTripId(Integer tripId) {
        return reviewRepo.findByTrip_TripId(tripId);
    }
}
