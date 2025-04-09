package app.demo.Controllers;

import app.demo.Dto.DtoBook;
import app.demo.Mapper.BookMapper;
import app.demo.Services.BookServicesImpl;
import app.demo.models.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class BookController {

    public BookServicesImpl bookServices;
    /**
     * Создает новую книгу.
     *
     * @param dtobook Объект DTO книги, содержащий информацию о новой книге.
     * @return ResponseEntity с сообщением об успешном создании книги.
     */
    @PostMapping("/book/create")
    public ResponseEntity<String> createBook(@RequestParam DtoBook dtobook){
        return ResponseEntity.ok(bookServices.save(BookMapper.toBook(dtobook)).toString());
    }
    /**
     * Обновляет существующую книгу.
     *
     * @param dtobook Объект DTO книги, содержащий обновленную информацию о книге.
     * @return ResponseEntity с сообщением об успешном обновлении книги.
     */
    @PostMapping("/book/update")
    public ResponseEntity<String> updateBook(@RequestParam DtoBook dtobook){
        return ResponseEntity.ok(bookServices.update(BookMapper.toBook(dtobook)).toString());
    }
    /**
     * Удаляет книгу по заданному идентификатору.
     *
     * @param dtobook
     * @return ResponseEntity с кодом 200 OK.
     */
    @DeleteMapping("/book/delete")
    public ResponseEntity create(@RequestParam DtoBook dtobook){
        bookServices.delete(BookMapper.toBook(dtobook));
        return (ResponseEntity) ResponseEntity.ok();
    }
    /**
     * Получает список всех книг.
     *
     * @return ResponseEntity с списком всех книг.
     */
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAll(){
        return ResponseEntity.ok(bookServices.getAll());
    }
}
