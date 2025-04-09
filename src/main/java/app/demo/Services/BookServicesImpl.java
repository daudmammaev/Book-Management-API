package app.demo.Services;

import app.demo.Dto.DtoBook;
import app.demo.Mapper.BookMapper;
import app.demo.Repository.BookRepository;
import app.demo.models.Book;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.stream.Collectors;

public class BookServicesImpl implements BookServices{

    public BookRepository bookRepository;
    /**
     * Конструктор для инициализации BookServicesImpl с репозиторием книг.
     *
     * @param bookRepository Репозиторий для работы с книгами.
     */
    public BookServicesImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * Сохраняет новую книгу в репозитории.
     *
     * @param book Книга для сохранения.
     * @return Сохраненная книга.
     */
    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    /**
     * Обновляет существующую книгу в репозитории.
     *
     * @param book Книга с обновленными данными.
     * @return Обновленная книга.
     */
    @Override
    public Book update(Book book) {
        return bookRepository.save(book);
    }

    /**
     * Удаляет книгу из репозитория.
     *
     * @param book Книга, которую необходимо удалить.
     */
    @Override
    public void delete(Book book) {
        bookRepository.delete(book);
    }

    /**
     * Получает список всех книг из репозитория.
     *
     * @return Список всех книг.
     */
    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    /**
     * Получает список книг по заголовку с учетом пагинации.
     *
     * @param title Заголовок книг для поиска.
     * @param pageable Параметры пагинации.
     * @return Список книг, соответствующих заданному заголовку.
     */
    @Override
    public List<DtoBook> getAllByTitle(String title, Pageable pageable) {
        return bookRepository.findAllByTitle(title, pageable)
                .stream().map(BookMapper::toDTO).collect(Collectors.toList());
    }

    /**
     * Получает список книг по бренду с учетом пагинации.
     *
     * @param brand Бренд книг для поиска.
     * @param pageable Параметры пагинации.
     * @return Список книг, соответствующих заданному бренду.
     */
    @Override
    public List<DtoBook> getAllByBrand(String brand, Pageable pageable) {
        return bookRepository.findAllByBrand(brand, pageable)
                .stream().map(BookMapper::toDTO).collect(Collectors.toList());
    }

    /**
     * Получает список книг по году издания с учетом пагинации.
     *
     * @param year Год издания книг для поиска.
     * @param pageable Параметры пагинации.
     * @return Список книг, соответствующих заданному году издания.
     */
    @Override
    public List<DtoBook> getAllByYear(int year, Pageable pageable) {
        return bookRepository.findAllByYear(year, pageable)
                .stream().map(BookMapper::toDTO).collect(Collectors.toList());
    }
}
