package com.tnsif.jpacurd.client;


import com.tnsif.jpacurd.entities.Book;
import com.tnsif.jpacurd.services.BookService;
import com.tnsif.jpacurd.services.BookServiceImpl;

public class BookClient {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        Book book = new Book("Robert C. Martin", "Clean Code", 550.0);

        bookService.addBook(book);

        System.out.println("Book added successfully!");

    }
}
