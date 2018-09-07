package main.service;

import main.entity.Author;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AuthorService {

    public void addAuthor(Author author);

    public void deleteAuthor(Author author);

    public List<Author> listAuthors();

    public Author getAuthorById(Long id);

    public void updateAuthor(Author author);

    /*
     * Avg age of users by author
     * */
    int getAvgAgeOfReaders(long authorId);

    boolean checkAuthorExist(String authorName);


}
