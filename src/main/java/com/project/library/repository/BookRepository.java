package com.project.library.repository;

import com.project.library.model.Book;
import com.project.library.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Category> findByCategory(Category category);
    Optional<Book> findByTitle(String title);
    List<Book> findByStockGreaterThan(int stock);
    Optional<Book> findByIsbn(String isbn);

}
