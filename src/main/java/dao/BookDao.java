package dao;

import entity.Book;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BookDao extends GenericDaoImpl<Book> {

    public BookDao(Class<Book> elementClass) {
        super(elementClass);
    }
}
