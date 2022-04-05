package com.example.bookslibrary.service;

import com.example.bookslibrary.model.Book;
import com.example.bookslibrary.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class BookService {
    //Dies ist die DI
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    //Klassen-Methoden
    public Book addBook(Book book){
        return bookRepository.addBook(book); //Verschachtelung!

    }

    public  List<Collection<Book>> getAllBooks(){
        return bookRepository.getAllBooks();
    }
    public Book getBookByIsbn(String isbn){
        return bookRepository.getBookByIsbn(isbn);
    }
    public Book deleteBookByIsbn(String isbn) {
        return bookRepository.deleteBookByIsbn(isbn);
    }

}
