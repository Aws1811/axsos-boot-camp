package com.axsos.bookclub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsos.bookclub.models.LoginUser;
import com.axsos.bookclub.models.User;
import com.axsos.bookclub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

import java.util.Arrays;
import java.util.List;

// @Controller: an MVC controller that returns JSP views
@Controller
public class HomeController {
    private static final List<String>  countryOptions = Arrays.asList(
            "United States", "Palestine", "Canada", "United Kingdom",
            "Germany", "France", "India", "Egypt", "Jordan", "Other"
    );

    private static final List<String>  languageOptions = Arrays.asList(
            "Java", "Python", "JavaScript", "C#", "C++", "Ruby", "Go", "Swift"
    );

    // Inject the user service (controller -> service -> repository)
    @Autowired
    private UserService userServ;

    // GET / : the login and registration page
    @GetMapping("/")
    public String index(Model model) {

        // Bind empty User and LoginUser objects to the JSP
        // to capture the form input
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        model.addAttribute("countryOptions",countryOptions);
        model.addAttribute("languageOptions",languageOptions);
        return "index";
    }

    // POST /register : handles the registration form
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser,
                           BindingResult result, Model model, HttpSession session) {

        // Call the register method in the service to do the
        // extra validations and create a new user if no errors
        User user = userServ.register(newUser, result);

        if (result.hasErrors()) {
            // Be sure to send in the empty LoginUser before
            // re-rendering the page.
            model.addAttribute("countryOptions", countryOptions);
            model.addAttribute("languageOptions", languageOptions);
            model.addAttribute("newLogin", new LoginUser());
            return "index";
        }

        // No errors!
        // Store their ID from the DB in session,
        // in other words, log them in.
        session.setAttribute("id", user.getId());

        return "redirect:/home";
    }

    // POST /login : handles the login form
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin,
                        BindingResult result, Model model, HttpSession session) {

        // The service checks: does a user with that email exist in the
        // database? If so, is the password the right password for that email?
        User user = userServ.login(newLogin, result);

        if (result.hasErrors()) {
            // Be sure to send in the empty User before
            // re-rendering the page.
            model.addAttribute("countryOptions", countryOptions);
            model.addAttribute("languageOptions", languageOptions);
            model.addAttribute("newUser", new User());
            return "index";
        }

        // No errors!
        // Store their ID from the DB in session,
        // in other words, log them in.
        session.setAttribute("id", user.getId());

        return "redirect:/books";
    }

    // GET /home : the success page (dashboard).
    // Only logged-in users are allowed to see it.
    @GetMapping("/home")
    public String home(HttpSession session, Model model) {

        // Should the user try to access the success page without being
        // logged in (no ID in session), they should be redirected
        // to the login and registration page.
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }

        // Grab the logged-in user's ID from session and use it to
        // fetch the user, so we can greet them by name on the page.
        Long userId = (Long) session.getAttribute("id");
        model.addAttribute("user", userServ.findUserById(userId));

        return "home";
    }

    // GET /logout : upon logging out,
    // the user's session should be terminated.
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate() destroys the session (removes the userId),
        // so /home will redirect them back to the login page.
        session.invalidate();
        return "redirect:/";
    }
}