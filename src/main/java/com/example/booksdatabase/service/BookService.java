package com.example.booksdatabase.service;

import com.example.booksdatabase.model.Books;
import com.example.booksdatabase.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BooksRepository booksRepository;
    public Books saveBook(Books book) {
        return booksRepository.save(book);
    }
}
