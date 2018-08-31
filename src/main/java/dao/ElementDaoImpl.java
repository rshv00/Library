package dao;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public abstract class ElementDaoImpl<E> implements ElementDao<E> {

    private Class<E> elementClass;

    @Override
    public void addElement(E element) {
        Session session = null;
        try {
            session = HibernateUtil.getInstance().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(element);
            transaction.commit();
        } finally {
            if ((session != null) && (session.isOpen())) {
                    session.close();
                }
        }

    }

    @Override
    public void updateElement(E element) {
        Session session = null;
        try {
            session = HibernateUtil.getInstance().openSession();
            Transaction transaction = session.beginTransaction();
            session.update(element);
            transaction.commit();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }

    }

    @Override
    public E getElementById(Long elementId) {
        Session session = null;
        E element;
        try {
            session = HibernateUtil.getInstance().openSession();
            element = (E) session.get(elementClass, elementId);
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
        return element;
    }

    @Override
    public List<E> getAllElements() {
        Session session = null;
        List<E> elements;
        try {
            session = HibernateUtil.getInstance().openSession();
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            elements = (List<E>) criteriaBuilder.createQuery(elementClass).getOrderList();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }

        }
        return elements;
    }

    @Override
    public void deleteElement(E element) {
        Session session = null;
        try {
            session = HibernateUtil.getInstance().openSession();
            Transaction transaction = session.beginTransaction();
            session.delete(element);
            transaction.commit();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
    }
}
