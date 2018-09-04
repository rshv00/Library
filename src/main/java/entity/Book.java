package entity;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    private String name;

    @ManyToMany(targetEntity = Author.class)
    @JoinTable(name = "authors", joinColumns = {@JoinColumn(name = "author_id")},
            inverseJoinColumns = {@JoinColumn(name = "book_id")})
    private Set<Author> authors;
    @OneToMany(mappedBy = "book")
    private Set<BookInstance> bookInstances;

    public Set<BookInstance> getBookInstances() {
        return bookInstances;
    }

    public Book() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public void setBookInstances(Set<BookInstance> bookInstances) {
        this.bookInstances = bookInstances;
    }
}