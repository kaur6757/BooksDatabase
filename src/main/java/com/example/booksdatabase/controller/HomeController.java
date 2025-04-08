package com.example.booksdatabase.controller;

import com.example.booksdatabase.model.Books;
import com.example.booksdatabase.service.BookService;
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
        model.addAttribute("book", new Books());
        return "addBook";
    }

    @PostMapping("/addBook")
    public String addBook(Books book) {
        bookService.saveBook(book);
        return "redirect:/";
    }
}
