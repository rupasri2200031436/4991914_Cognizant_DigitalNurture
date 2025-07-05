package com.LibraryManagement.repository;

import com.LibraryManagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
