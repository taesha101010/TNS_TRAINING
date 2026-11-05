package com.tnsif.jpacurd.dao;
import com.tnsif.jpacurd.entities.Book;
import java.util.List;

    public interface BookDao {
        void addBook(Book book);
        List<Book> getAllBooks();
        Book getBookById(int id);
        void updateBook(Book book);
        void deleteBook(int id);
    }

