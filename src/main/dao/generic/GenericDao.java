package main.dao.generic;

import java.util.List;

public interface GenericDao<E, ID, P> {

    void addElement(E element);

    void updateElement(E element);

    E getElementById(ID id);

    List<E> getAllElements();

    List<E> getAllElements(String column, P value);

    void deleteElement(E element);
}
