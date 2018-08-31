package dao;

import java.util.List;

public interface ElementDao<E> {

    public void addElement(E element);

    public void updateElement(E element);

    public E getElementById(Long elementId);

    public List<E> getAllElements();

    public void deleteElement(E element);
}
