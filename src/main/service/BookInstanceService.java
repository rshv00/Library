package main.service;

import main.entity.BookInstance;

import java.util.List;

public interface BookInstanceService {

    public void addBookInstance(BookInstance instance);

    public void deleteBookInstance(BookInstance instance);

    public List<BookInstance> listBooks();

    public BookInstance getBookById(Long id);

    public void updateBook(BookInstance instance);

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

}
