package main.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "records")
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_id")
    private long id;

    @Column(name = "taken")
    private LocalDate taken;

    @Column(name = "returned")
    private LocalDate returned;


    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    private BookInstance instance;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getTaken() {
        return taken;
    }

    public void setTaken(LocalDate taken) {
        this.taken = taken;
    }

    public LocalDate getReturned() {
        return returned;
    }

    public void setReturned(LocalDate returned) {
        this.returned = returned;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BookInstance getInstance() {
        return instance;
    }

    public void setInstance(BookInstance instance) {
        this.instance = instance;
    }

    public Record() {
    }
}