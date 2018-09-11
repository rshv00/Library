package main.service;

import main.entity.Author;
import main.entity.BookInstance;

import java.util.List;
import java.util.Set;

public interface BookInstanceService {

    public void addBookInstance(BookInstance instance);

    public void deleteBookInstance(BookInstance instance);

    public List<BookInstance> listBooks();

    public BookInstance getBookById(Long id);

    public void updateBookInstance(BookInstance instance);

    /*
     * Get all instances by book name
     **/
    public List<BookInstance> getInstances(String bookName);

    /*
     * Get all instances by book name and editionYear
     **/
    List<BookInstance> getInstances(String bookName, int editionYear);

    public int getTakenTimes(long id);

    /*
     * All instances, where BookInstance.available=true
     * */
    List<BookInstance> getAvailableInstances();

    /*
     * Returns true if as minimum one instance of book exist
     * */
    public boolean checkInstanceExist(String bookName, int editionYear);

    public int getCountInstancesAfter1991();

    public void updateBookInfo(long instanceId, String bookName, String coauthor, int editionYear, Set<Author> authors);

}
