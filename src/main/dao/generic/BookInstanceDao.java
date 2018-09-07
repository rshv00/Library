package main.dao.generic;

import main.entity.BookInstance;

import java.util.HashMap;
import java.util.List;

public interface BookInstanceDao {



    /*
     * Instance taken times
     * */
    int takenTimes(int id);

    /*
     * Map[instanceId, takenTimes] by book name
     * */
    HashMap<Long, Integer> takenTimes(String bookName);

    /*
     * Amount of instances in library were edited after 1991
     * */
    int countInstancesAfter1991();

    public List<BookInstance> getInstances(String bookName, int editionYear);

    public boolean checkInstanceExist(String bookName, int editionYear);

    public List<BookInstance> getInstances(String bookName);


}
