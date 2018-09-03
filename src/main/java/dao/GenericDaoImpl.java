package dao;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public abstract class GenericDaoImpl<E> implements GenericDao<E> {

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
        CriteriaQuery<E> cr;
        try {
            session = HibernateUtil.getInstance().openSession();
            CriteriaBuilder cb = session.getCriteriaBuilder();
            cr = cb.createQuery(elementClass);
            Root<E> root = cr.from(elementClass);
            cr = cr.select(root).where(cb.gt(root.get("id"), elementId));
            element = (E) session.get(elementClass, elementId);
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
        return element;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<E> getAllElements() {
        Session session = null;
        CriteriaQuery<E> cr;

        try {
            session = HibernateUtil.getInstance().openSession();

            CriteriaBuilder cb = session.getCriteriaBuilder();

            cr = cb.createQuery(elementClass);

            Root<E> root = cr.from(elementClass);
            cr = cr.select(root);

        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }

        }
        Query query = session.createQuery(cr);

        return query.getResultList();
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
