package com.axsos.bookclub.services;

import com.axsos.bookclub.models.Book;
import com.axsos.bookclub.models.User;
import com.axsos.bookclub.repositires.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServices {
private final BookRepo bookRepo;

public BookServices(BookRepo bookRepo){
    this.bookRepo = bookRepo;
}
 public List<Book> getAllBooks(){
    return bookRepo.findAll();
 }
 public  Book getSingleBookById(Long book_id){
     Optional<Book> optionalBook = bookRepo.findById(book_id);
     if(optionalBook.isPresent()){
             return optionalBook.get();
     }
     return null;

 }
 public void createCallBook(Book book){
    bookRepo.save(book);
 }
 public void deleteCallBook(Long book_id){
    bookRepo.deleteById(book_id);
 }
 public Book updateCallBook(Long book_id, String title, String authorName, String description){
    Book book = getSingleBookById(book_id);
    book.setAuthorName(authorName);
    book.setTitle(title);
    book.setDescription(description);
    return bookRepo.save(book);
 }
    // ===== BOOK BROKER FEATURE =====
    // Everything below supports the borrow/return dashboard.
    // Borrowing only touches the book's "borrower" field —
    // it never touches "user" (the original owner/poster).

    // Books shown on the dashboard's top table: anything unborrowed
    // (so others can borrow it), plus the logged-in user's own books
    // regardless of borrow status (so an owner never loses sight of
    // their own book — it just shows edit/delete instead of borrow).
    public List<Book> getAvailableBooks(User currentUser){
        return bookRepo.findByBorrowerIsNullOrUser(currentUser);
    }

    // Books the logged-in user is currently borrowing.
    // Feeds the "Books I'm Borrowing" table.
    public List<Book> getBorrowedBooks(User currentUser){
        return bookRepo.findByBorrower(currentUser);
    }

    // Marks a book as borrowed by the logged-in user.
    public void borrowBook(Long book_id, User currentUser){
        Book book = getSingleBookById(book_id);
        book.setBorrower(currentUser);
        bookRepo.save(book);
    }

    // Clears a book's borrower, making it available again.
    public void returnBook(Long book_id){
        Book book = getSingleBookById(book_id);
        book.setBorrower(null);
        bookRepo.save(book);
    }



}


