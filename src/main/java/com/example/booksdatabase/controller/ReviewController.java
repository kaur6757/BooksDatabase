package com.example.booksdatabase.controller;

import com.example.booksdatabase.model.Books;
import com.example.booksdatabase.model.Review;
import com.example.booksdatabase.service.BookService;
import com.example.booksdatabase.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    private BookService bookService;

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/books")
    public List<Books> getBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping("/books/{bookId}")
    public List<Review> getReviews(@PathVariable Long bookId) {
        return reviewService.getReviewsByBookId(bookId);
    }

    @PostMapping("/books/{bookId}/add")
    public Review addReview(@PathVariable Long bookId, @RequestBody Review review) {
        return reviewService.addReview(bookId, review);
    }

}
