package com.axsos.bookclub.controllers;

import com.axsos.bookclub.models.Book;
import com.axsos.bookclub.models.User;
import com.axsos.bookclub.services.BookServices;
import com.axsos.bookclub.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
private final BookServices bookServices;
    private final UserService userService;

    public BookController(BookServices bookServices, UserService userService){
    this.bookServices =bookServices;
        this.userService = userService;
    }

@RequestMapping("")
    public String ShowBooks( Model model , HttpSession session){
    if (session.getAttribute("id") == null) {
        return "redirect:/";
    }
    Long id = (Long) session.getAttribute("id");
    model.addAttribute("user", userService.findUserById(id));
    model.addAttribute("books",bookServices.getAllBooks());
    return "home";
}

@RequestMapping("/create")
public String createBookPage(HttpSession session,Model model){
    if (session.getAttribute("id") == null) {
        return "redirect:/";
    }
    Long id = (Long) session.getAttribute("id");
    model.addAttribute("user", userService.findUserById(id));
    model.addAttribute("books",new Book());
        return "createbook";
}

@PostMapping("/create/new")
    public String createBook(HttpSession session, @Valid @ModelAttribute("books")Book book, BindingResult result, Model model){
    if (session.getAttribute("id") == null) {
        return "redirect:/";
    }
        if(result.hasErrors()){
            model.addAttribute("books",book);
            return "createbook";
        }
    Long id = (Long) session.getAttribute("id");
        User user = userService.findUserById(id);
        book.setUser(user);
        bookServices.createCallBook(book);
        return "redirect:/books";
}

@RequestMapping("/update/{book_id}")
public String updateBookPage(@PathVariable("book_id")Long book_id,HttpSession session,Model model){
    if (session.getAttribute("id") == null) {
        return "redirect:/";
    }
    Book book = bookServices.getSingleBookById(book_id);
    Long sessionId = (Long) session.getAttribute("id");
    if (!book.getUser().getId().equals(sessionId)) {
        return "redirect:/books";
    }

    Long id = (Long) session.getAttribute("id");

    model.addAttribute("books",book);
    model.addAttribute("user",userService.findUserById(id));
    return "updatebook";
}

    @PostMapping("update/{book_id}/edit")
    public String updateBook(HttpSession session,@PathVariable("book_id") Long book_id,
                             @Valid @ModelAttribute("books") Book book, BindingResult result, Model model){
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        Long sessionId = (Long) session.getAttribute("id");
        Book existing = bookServices.getSingleBookById(book_id);
        if (!existing.getUser().getId().equals(sessionId)) {
            return "redirect:/books";
        }
        if (result.hasErrors()){
            model.addAttribute("books", book);
            return "updatebook";
        }
        bookServices.updateCallBook(book_id, book.getTitle(), book.getAuthorName(), book.getDescription());
        return "redirect:/books";
    }
@RequestMapping("/delete/{book_id}")
public  String deleteBook(@PathVariable("book_id") Long book_id,HttpSession session){
    if (session.getAttribute("id") == null) {
        return "redirect:/";
    }
    Book book = bookServices.getSingleBookById(book_id);
    Long sessionId = (Long) session.getAttribute("id");
    if (!book.getUser().getId().equals(sessionId)) {
        return "redirect:/books";
    }
    bookServices.deleteCallBook(book_id);
    return "redirect:/books";
    }
@RequestMapping("/{book_id}")
public String showBook(@PathVariable("book_id")Long book_id,HttpSession session,Model model) {
    if (session.getAttribute("id") == null) {
        return "redirect:/";
    }
    Long id = (Long) session.getAttribute("id");
    model.addAttribute("user", userService.findUserById(id));
        model.addAttribute("book",bookServices.getSingleBookById(book_id));
        return "bookdetails";
    }
    // ===== BOOK BROKER FEATURE =====
    // Marks the book as borrowed by the logged-in user.
    // Single-link action, same style as deleteBook.
    @RequestMapping("/{book_id}/borrow")
    public String borrowBook(@PathVariable("book_id") Long book_id, HttpSession session){
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        Long id = (Long) session.getAttribute("id");
        User currentUser = userService.findUserById(id);
        bookServices.borrowBook(book_id, currentUser);
        return "redirect:/bookmarket";
    }

    // Clears the borrower, returning the book to the available pool.
    @RequestMapping("/{book_id}/return")
    public String returnBook(@PathVariable("book_id") Long book_id, HttpSession session){
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        bookServices.returnBook(book_id);
        return "redirect:/bookmarket";
    }

    // The Book Broker dashboard: two tables, available books and
    // books the logged-in user is currently borrowing.
    @RequestMapping("/bookmarket")
    public String bookMarket(HttpSession session, Model model){
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        Long id = (Long) session.getAttribute("id");
        User currentUser = userService.findUserById(id);
        model.addAttribute("user", currentUser);
        model.addAttribute("availableBooks", bookServices.getAvailableBooks(currentUser));
        model.addAttribute("borrowedBooks", bookServices.getBorrowedBooks(currentUser));
        return "bookmarket";
    }


}
