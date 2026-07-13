package com.axsos.projectmanager.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

// @Entity: this class maps to a table in the database
@Entity
// The actual table name in MySQL is "users"
@Table(name = "users")
public class User {

    // Primary key, auto-incremented by MySQL
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Username - letters only, at least 3 characters, not blank
    @NotEmpty(message = "Username is required!")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Username must contain letters only!")
    @Size(min = 3, max = 30, message = "Username must be between 3 and 30 characters")
    private String userName;

    // Email - valid Email format, not blank
    // (checking that it does not already exist in the database
    //  happens in the service, because it needs a database query)
    @NotEmpty(message = "Email is required!")
    @Email(message = "Please enter a valid email!")
    private String email;

    // Password - at least 8 characters, not blank
    @NotEmpty(message = "Password is required!")
    @Size(min = 8, max = 128, message = "Password must be between 8 and 128 characters")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[0-9]).+$",message = "Password sould contine an upper case numbers")
    private String password;

    // @Transient: this field is NOT stored in the database.
    // When saving a User with a JPA method, all transient fields are ignored,
    // and only the persistent fields are stored in the database.
    // We only use it temporarily to compare it against the password.
    @Transient
    @NotEmpty(message = "Confirm Password is required!")
    @Size(min = 8, max = 128, message = "Confirm Password must be between 8 and 128 characters")
    private String confirm;

    @NotEmpty(message = "please select a country")
    private String country;

    @NotEmpty(message = "please select a gender")
    private String gender;

    @NotNull(message = "Birthday is required")
    @Past(message = "please enter a valid date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDay;


    @NotEmpty(message = "Please select at least one programming language!")
    private List<String>languages;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Book> books;

    @OneToMany(mappedBy = "borrower", fetch = FetchType.LAZY)
    private List<Book> borrowedBooks;


    // Empty constructor required by JPA
    public User() {
    }

    public User(Long id, String userName, String email, String password,List<Book> books,List<Book> borrowedBooks,
                String confirm, String country, String gender, LocalDate birthDay, List<String> languages) {
        this.id = id;
        this.userName = userName;
        this.borrowedBooks = borrowedBooks;
        this.email = email;
        this.password = password;
        this.confirm = confirm;
        this.country = country;
        this.gender = gender;
        this.birthDay = birthDay;
        this.books =books;
        this.languages = languages;
    }

    // ----- getters and setters -----
    public Long getId() {
        return id;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}