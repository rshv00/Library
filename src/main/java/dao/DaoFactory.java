package dao;

import entity.*;


public class DaoFactory {
    private AuthorDao authorDao;
    private BookDao bookDao;
    private BookInstanceDao bookInstanceDao;
    private RecordDao recordDao;
    private UserDao userDao;

    private static DaoFactory instance;

    private DaoFactory() {
        authorDao = new AuthorDao(Author.class);
        bookDao = new BookDao(Book.class);
        bookInstanceDao = new BookInstanceDao(BookInstance.class);
        recordDao = new RecordDao(Record.class);
        userDao = new UserDao(User.class);
    }

    public static synchronized DaoFactory getInstance() {
        if (instance == null) {
            instance = new DaoFactory();
        }
        return instance;
    }

    public AuthorDao getAuthorDao() {
        return authorDao;
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public BookInstanceDao getBookInstanceDao() {
        return bookInstanceDao;
    }

    public RecordDao getRecordDao() {
        return recordDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }
}
