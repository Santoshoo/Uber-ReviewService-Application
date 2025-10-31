package com.example.UberReviewServiceApplication.repositories;

import com.example.UberReviewServiceApplication.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
}
