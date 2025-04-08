package com.example.booksdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface BooksRepository extends JpaRepository<Book, Long> {
}
