package main.service;

import main.entity.Author;

import java.util.List;

public interface AuthorService {

    public void addAuthor(Author author);

    public void deleteAuthor(Author author);

    public List<Author> listAuthors();

    public Author getAuthorById(Long id);

    public void updateAuthor(Author author);

    public int getAvgAgeOfReaders(String authorName);

}
