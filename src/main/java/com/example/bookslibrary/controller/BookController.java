package com.example.bookslibrary.controller;

import com.example.bookslibrary.model.Book;
import com.example.bookslibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping ("/books")

public class BookController {
    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @PostMapping

    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }
    @GetMapping
    public List<Collection<Book>> getAllBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping(path="{isbn}")
    public Book getBookByIsbn(@PathVariable String isbn){
        return bookService.getBookByIsbn(isbn);
    }
    @DeleteMapping(path="{isbn}")
    public Book deleteBookByIsbn(@PathVariable String isbn){
        return bookService.deleteBookByIsbn(isbn);
    }
}
