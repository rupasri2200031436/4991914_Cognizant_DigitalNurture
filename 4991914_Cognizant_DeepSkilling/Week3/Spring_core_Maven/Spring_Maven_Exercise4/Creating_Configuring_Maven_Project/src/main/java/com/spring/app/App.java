package com.spring.app;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring context from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the BookService bean
        BookService bookService = context.getBean("bookService", BookService.class);

        // Use the service
        bookService.performService();
    }
}
