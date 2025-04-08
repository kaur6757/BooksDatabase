package com.example.booksdatabase.service;

import com.example.booksdatabase.model.Review;
import com.example.booksdatabase.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getReviewsByBookId(Long bookId) {
        return reviewRepository.findByBookId(bookId);
    }

    public Review addReview(Long bookId, Review review) {
        review.setBookId(bookId);
        return reviewRepository.save(review);
    }


}
