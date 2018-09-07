package main.entity;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @Column(name = "author_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_book", joinColumns = {@JoinColumn(name = "author_id")},
            inverseJoinColumns = {@JoinColumn(name = "book_id")})
    private Set<Book> books;

    public Author() {
    }

    public long getId() {
        return id;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
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


}