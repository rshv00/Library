package dao;

import entity.Book;

public class BookDao extends GenericDaoImpl<Book> {

    public BookDao(Class<Book> elementClass) {
        super(elementClass);
    }
}
