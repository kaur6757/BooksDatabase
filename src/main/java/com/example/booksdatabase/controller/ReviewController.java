package com.example.booksdatabase.controller;

import com.example.booksdatabase.model.Books;
import com.example.booksdatabase.model.Review;
import com.example.booksdatabase.repository.ReviewRepository;
import com.example.booksdatabase.service.BookService;
import com.example.booksdatabase.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/reviews")
@CrossOrigin("http://localhost:4200")
public class ReviewController {
    @Autowired
    private BookService bookService;

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/books")
    public List<Books> getBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping("/books/{bookId}")
    public List<Review> getReviews(@PathVariable Long bookId) {
        System.out.println("Fetching reviews for bookId: " + bookId);
        return reviewRepository.findByBookId(bookId);
    }

    @PostMapping("/books/{bookId}/add")
    public Review addReview(@PathVariable Long bookId, @RequestBody Review review) {
        System.out.println("Adding review for bookId: " + bookId);
        System.out.println("Review details: " + review);
        return reviewService.addReview(bookId, review);
    }

}
