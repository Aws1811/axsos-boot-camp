package com.axsos.projectmanager.controllers;

import com.axsos.projectmanager.models.User;
import com.axsos.projectmanager.services.BookServices;
import com.axsos.projectmanager.services.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// ===== BOOK BROKER FEATURE =====
// Separate controller so the dashboard lives at exactly /bookmarket,
// matching the wireframe URL, instead of inheriting /books from
// BookController's class-level @RequestMapping.
@Controller
public class BookMarketController {

    private final BookServices bookServices;
    private final UserService userService;

    public BookMarketController(BookServices bookServices, UserService userService){
        this.bookServices = bookServices;
        this.userService = userService;
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

    // Marks the book as borrowed by the logged-in user.
    @RequestMapping("/bookmarket/{book_id}/borrow")
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
    @RequestMapping("/bookmarket/{book_id}/return")
    public String returnBook(@PathVariable("book_id") Long book_id, HttpSession session){
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        bookServices.returnBook(book_id);
        return "redirect:/bookmarket";
    }
}