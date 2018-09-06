package main.dao.impl;

import main.dao.generic.GenericDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Repository
public abstract class GenericDaoImpl<E, ID extends Serializable> implements GenericDao<E, ID> {

    @Autowired
    private SessionFactory sessionFactory;

    private Class<E> elementClass;

    GenericDaoImpl() {}

    GenericDaoImpl(Class<E> elementClass) {
        this.elementClass = elementClass;
    }

    @Override
    @Transactional
    public void addElement(E element) {
       sessionFactory.getCurrentSession().save(element);
    }

    @Override
    @Transactional
    public void updateElement(E element) {
        sessionFactory.getCurrentSession().update(element);
    }

    @Override
    @Transactional
    public E getElementById(ID id) {
        return sessionFactory
                .getCurrentSession()
                .get(elementClass, id);
    }


    @Override
    @Transactional
    @SuppressWarnings("unchecked")
    public List<E> getAllElements() {
        return (List<E>) sessionFactory
                .getCurrentSession()
                .createQuery("from " + elementClass.getName())
                .list();
    }

    @Override
    @Transactional
    public void deleteElement(E element) {
        sessionFactory.getCurrentSession().delete(element);
    }

}
