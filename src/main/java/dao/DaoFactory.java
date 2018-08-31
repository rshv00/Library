package dao;

import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
public class DaoFactory {
    private AuthorDao authorDao;
    private BookDao bookDao;
    private BookInstanceDao bookInstanceDao;
    private RecordDao recordDao;

    private static DaoFactory instance;

    public DaoFactory() {
        authorDao = new AuthorDao();
        bookDao = new BookDao();
        bookInstanceDao = new BookInstanceDao();
        recordDao = new RecordDao();
    }

    public static synchronized DaoFactory getInstance() {
        if (instance == null) {
            instance = new DaoFactory();
        }
        return instance;
    }


}
