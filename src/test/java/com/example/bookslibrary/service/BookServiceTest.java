package com.example.bookslibrary.service;

import com.example.bookslibrary.model.Book;
import com.example.bookslibrary.repository.BookRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    void addBook() {
    //given
        BookRepository repo = mock(BookRepository.class);
        BookService bookservice = new BookService(repo);
      Book book = new Book("4712","Harald Potter", "Horror");

    //when
        when(repo.addBook(book))
                .thenReturn(book);
    //then
    assertEquals(book, bookservice.addBook(book));
    verify(repo).addBook(book);
    }

    @Test
    void getAllBooks() {
    }

    @Test
    void getBookByIsbn() {
    }

    @Test
    void deleteBookByIsbn() {
    }
}