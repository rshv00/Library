package com.edu.library.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
public interface GenericDao<E> {

    void addElement(E element);

    void updateElement(E element);

    E getElementById(Long elementId);

    List<E> getAllElements();

    void deleteElement(E element);
}
