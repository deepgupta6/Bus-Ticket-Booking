package com.busticket.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.busticket.entity.Review;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IReviewRepo extends JpaRepository<Review, Long>{

   List<Review> findByCustomer_CustomerId(long customerId);
   List<Review> findByTrip_TripId(long tripId);
}
