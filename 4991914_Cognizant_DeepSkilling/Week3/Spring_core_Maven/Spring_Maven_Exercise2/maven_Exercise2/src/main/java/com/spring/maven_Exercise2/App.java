package com.spring.maven_Exercise2;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
 public static void main(String[] args) {
     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

     BookService bookService = context.getBean("bookService", BookService.class);
     bookService.addBook("Introduction To Programming in Java");
 }
}

