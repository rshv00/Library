package main.dao.generic;

import java.util.List;

public interface GenericDao<E, ID> {

    void addElement(E element);

    void updateElement(E element);

    E getElementById(ID id);

    List<E> getAllElements();

    void deleteElement(E element);
}
