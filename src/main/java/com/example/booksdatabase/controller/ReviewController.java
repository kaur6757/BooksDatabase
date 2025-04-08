package com.example.booksdatabase.controller;

import com.example.booksdatabase.model.Books;
import com.example.booksdatabase.service.BookService;
import com.example.booksdatabase.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
