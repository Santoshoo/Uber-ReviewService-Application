package com.example.UberReviewServiceApplication.services;

import com.example.UberReviewServiceApplication.models.Review;
import com.example.UberReviewServiceApplication.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService  implements CommandLineRunner {
    private ReviewRepository reviewRepository;

  public ReviewService(ReviewRepository reviewRepository){
      this.reviewRepository=reviewRepository;
  }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("*****************");
        Review r=Review.builder()
                .content("Amazon")
//                .createdAt(new Date())
//                .updatedAt(new Date())
                .rating(4.0)
                .build();//code to create plane java object
        reviewRepository.save(r);

        List<Review> reviews=reviewRepository.findAll();
        for(Review review : reviews){
            System.out.println(r.getContent());
        }

    }
}
