package dao;

import entity.Author;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AuthorDao extends ElementDaoImpl<Author> {

    public AuthorDao(Class<Author> elementClass) {
        super(elementClass);
    }
}
