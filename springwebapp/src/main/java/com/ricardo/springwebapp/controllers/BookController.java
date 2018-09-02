package com.ricardo.springwebapp.controllers;

import com.ricardo.springwebapp.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BookRepository bookRepository;

    // Going to automatically inject the BookRepository
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books") // When the user enters /books endpoint, start this method
    public String getBooks(Model model) {
        // Here we added one attribute called books in our model
        // This attribute is going to be our list of books in the database (Iterable<T>), T is from type Book
        model.addAttribute("books", bookRepository.findAll());

        // Retuning the name o our attribute created right above
        // This attribute is going to tell spring MVC to associate this attribute to a view called books
        // The view that's going to be called, is inside resources directory, under templates
        return "books";
    }
}
