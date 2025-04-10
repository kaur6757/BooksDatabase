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
        if (bookService.getAllBooks().isEmpty()) {
            // Seed only if the books table is empty
            bookService.saveBook(new Books("Journey Through Heartsongs", "Stepanek, Mattie J. T", 19.99));
            bookService.saveBook(new Books("Dragons of Autumn Twilight", "Margaret Weis", 29.99));
            bookService.saveBook(new Books("The Road", "Cormac McCarthy", 16.99));
        }
    }
}
