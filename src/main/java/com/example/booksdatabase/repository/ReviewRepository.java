package com.example.booksdatabase.repository;

import com.example.booksdatabase.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
