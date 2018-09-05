package main.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public abstract class GenericDaoImpl<E> implements GenericDao<E> {

    @Autowired
    private SessionFactory sessionFactory;

    private Class<E> elementClass;

    GenericDaoImpl(Class<E> elementClass) {
        this.elementClass = elementClass;
    }

    @Override
    @Transactional
    public void addElement(E element) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(element);
    }

    @Override
    @Transactional
    public void updateElement(E element) {
        sessionFactory.getCurrentSession().update(element);
    }

    @Override
    @Transactional
    public E getElementById(Long elementId) {
        return sessionFactory
                .getCurrentSession()
                .get(elementClass, elementId);
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
