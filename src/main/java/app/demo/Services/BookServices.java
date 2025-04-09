package app.demo.Services;

import app.demo.Dto.DtoBook;
import app.demo.models.Book;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookServices {
    Book save(Book book);
    Book update(Book book);
    void delete(Book book);
    List<Book> getAll();
    List<DtoBook> getAllByTitle(String title, Pageable pageable);
    List<DtoBook> getAllByBrand(String brand, Pageable pageable);
    List<DtoBook> getAllByYear(int year, Pageable pageable);
}
