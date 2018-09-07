package main.service;

import main.entity.BookInstance;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookInstanceService {

    public void addBookInstance(BookInstance instance);

    public void deleteBookInstance(BookInstance instance);

    public List<BookInstance> listBooks();

    public BookInstance getBookById(Long id);

    public void updateBook(BookInstance instance);


}
