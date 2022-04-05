package com.example.bookslibrary.repository;

import com.example.bookslibrary.model.Book;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class BookRepository {

    Map<String, Book> bookRepository = new HashMap<>();

    public BookRepository(){

    }
    //Klassen-Methoden
    public Book addBook(Book book){
        bookRepository.put(book.getIsbn(), book);
        return book;
    }
    //Get all Books
    public List<Collection<Book>> getAllBooks(){
        return List.of(bookRepository.values());
    }
    //Get Book by isbn
    public Book getBookByIsbn (String isbn){
        return bookRepository.get(isbn);
    }
    //delete book by isbn
    public Book deleteBookByIsbn(String isbn) {

        return bookRepository.remove(isbn);
    }

}