package ru.tukmakov.book_library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tukmakov.book_library.models.Book;

import java.util.List;

public interface BooksRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitleStartingWith(String title);
}
