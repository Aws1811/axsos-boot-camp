package com.axsos.bookclub.services;

import com.axsos.bookclub.models.Book;
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



}


