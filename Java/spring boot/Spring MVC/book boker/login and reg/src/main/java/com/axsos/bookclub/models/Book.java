package com.axsos.bookclub.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;

    @NotEmpty(message = "please fill the title")
    @Size(min = 2,max = 120,message = "please fill the blank")
    private String Title;

    @NotEmpty(message = "please fill the ayther name ")
    @Size(min = 2,max = 120,message = "please fill the blank")
    private String authorName;

    @NotEmpty(message = "plaese fill the thoughts")
    @Size(min = 2,max = 120,message = "please fill the blank")
    private String description;

    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name = "id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "borrower_id")
    private User borrower;

    public Book(){}
    public Book(Long book_id, String title, String authorName, String description,User user,User borrower) {
        this.book_id = book_id;
        this.borrower = borrower;
        Title = title;
        this.authorName = authorName;
        this.user = user;
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public User getUser() {
        return user;
    }

    public User getBorrower() {
        return borrower;
    }

    public void setBorrower(User borrower) {
        this.borrower = borrower;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
