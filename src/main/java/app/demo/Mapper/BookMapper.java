package app.demo.Mapper;

import app.demo.Dto.DtoBook;
import app.demo.models.Book;

public class BookMapper {

    public static DtoBook toDTO(Book book) {
        return new DtoBook(
                book.getId(),
                book.getVendorCode(),
                book.getTitle(),
                book.getYear(),
                book.getBrand(),
                book.getStock(),
                book.getPrice()
        );
    }

    public static Book toBook(DtoBook bookDTO) {
        return new Book(
                bookDTO.getId(),
                bookDTO.getVendorCode(),
                bookDTO.getTitle(),
                bookDTO.getYear(),
                bookDTO.getBrand(),
                bookDTO.getStock(),
                bookDTO.getPrice()
        );
    }
}