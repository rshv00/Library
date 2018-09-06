package main.service;

import main.entity.Book;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Scope("prototype")
public interface BookService {

    public void addBook(Book book);

    public void deleteBook(Book book);

    public List<Book> listBooks();

    public Book getBookById(Long id);
}
