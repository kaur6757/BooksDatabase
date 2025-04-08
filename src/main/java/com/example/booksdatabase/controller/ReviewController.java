package com.example.booksdatabase.controller;

import com.example.booksdatabase.service.BookService;
import com.example.booksdatabase.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    private BookService bookService;

    @Autowired
    private ReviewService reviewService;
}
