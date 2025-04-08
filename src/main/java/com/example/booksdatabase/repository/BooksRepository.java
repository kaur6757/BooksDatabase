package com.example.booksdatabase.repository;

import com.example.booksdatabase.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface BooksRepository extends JpaRepository<Books, Long> {
}
