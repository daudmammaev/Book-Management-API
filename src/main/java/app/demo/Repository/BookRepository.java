package app.demo.Repository;

import app.demo.models.Book;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findAllByBrand(String brand, Pageable pageable);
    List<Book> findAllByTitle(String brand, Pageable pageable);
    List<Book> findAllByYear(int year, Pageable pageable);
}
