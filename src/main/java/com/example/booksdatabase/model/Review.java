package com.example.booksdatabase.model;

import jakarta.persistence.*;

@Entity
public class Review {

    //Properties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bookId;
    private String reviewerName;
    private int rating;
    private String comment;

    //Default constructor
    public Review() {
    }

    public Review(Long id, String reviewerName, int rating, String comment) {
        this.id = id;
        this.reviewerName = reviewerName;
        this.rating = rating;
        this.comment = comment;

    }
    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
}
