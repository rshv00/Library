package dao;

import entity.BookInstance;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BookInstanceDao extends GenericDaoImpl<BookInstance> {

    public BookInstanceDao(Class<BookInstance> elementClass) {
        super(elementClass);
    }
}
