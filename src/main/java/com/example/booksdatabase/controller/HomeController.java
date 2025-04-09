package com.example.booksdatabase.controller;

import com.example.booksdatabase.model.Books;
import com.example.booksdatabase.service.BookService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("books", new Books());
        return "addBook";
    }

    @PostMapping("/addBook")
    public String addBook(Books book) {
        bookService.saveBook(book);
        return "redirect:/";
    }

    @PostConstruct
    public void init() {
        // Create and save initial book data
        bookService.saveBook(new Books("Book 1", "Author 1", 19.99));
        bookService.saveBook(new Books("Book 2", "Author 2", 29.99));
        bookService.saveBook(new Books("Book 3", "Author 3", 39.99));
    }
}
