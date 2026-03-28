package com.busticket.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.busticket.entity.Review;

public interface IReviewRepo extends JpaRepository<Review, Long>{

}
