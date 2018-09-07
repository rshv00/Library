package main.dao.generic;

import main.entity.BookInstance;

import java.util.HashMap;
import java.util.List;

public interface BookInstanceDao {

    /*
     * Get all instances by book name
     **/
    List<BookInstance> getInstances(String bookName);

    /*
     * Instance taken times
     * */
    int takenTimes(int id);

    /*
     * Map[instanceId, takenTimes] by book name
     * */
    HashMap<Long, Integer> takenTimes(String bookName);

    /*
     * All instances, where BookInstance.available=true
     * */
    List<BookInstance> getAvailableInstances();

    /*
     * Amount of instances in library were edited after 1991
     * */
    int countInstancesAfter1991();

}
