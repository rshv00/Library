package main.service;

import main.entity.BookInstance;

import java.util.HashMap;
import java.util.List;

public interface BookInstanceService {

    public void addBookInstance(BookInstance instance);

    public void deleteBookInstance(BookInstance instance);

    public List<BookInstance> listBooks();

    public BookInstance getBookById(Long id);

    public void updateBook(BookInstance instance);

    public List<BookInstance> getInstances(String bookName);

    public int takenTimes(int id);

    public HashMap<Long, Integer> takenTimes(String bookName);

    public List<BookInstance> getAvailableInstances();

    public int countInstancesAfter1991();
}
