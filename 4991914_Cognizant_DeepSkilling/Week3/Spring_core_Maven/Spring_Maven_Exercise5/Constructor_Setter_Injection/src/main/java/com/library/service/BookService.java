package com.library.service;
import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String serviceName;

    // Constructor for constructor injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
        System.out.println("Constructor injected: " + serviceName);
    }

    // Setter for setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter injected: BookRepository set.");
    }

    public void addBook(String title) {
        System.out.println("Adding book using service: " + serviceName);
        bookRepository.saveBook(title);
    }
}
