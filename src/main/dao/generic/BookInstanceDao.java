package main.dao.generic;

import main.entity.BookInstance;

import java.util.List;

public interface BookInstanceDao extends GenericDao<BookInstance, Long, Integer> {

    /*
     * Get all instances by book name
     **/
    List<BookInstance> getInstances(String bookName);

    /*
     * Get all instances by book name and editionYear
     **/
    List<BookInstance> getInstances(String bookName, int editionYear);

    int getTakenTimes(long id);

    /*
     * All instances, where BookInstance.available=true
     * */
    List<BookInstance> getAvailableInstances();

    /*
     * Returns true if as minimum one instance of book exist
     * */
    boolean checkInstanceExist(String bookName, int editionYear);

    int countInstancesAfter1991();

}
