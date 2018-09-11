package main.entity;

import main.entity.enums.UserRole;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;
    private String name;
    private String phone;
    private LocalDate birth_date;
    private LocalDate registration_date;
    @OneToMany(mappedBy = "user")
    private Set<Record> records;
    private int role;
    private String username;
    private String password;
    private int enabled = 1 ;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "authority")
    private Authority authority;
    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public LocalDate getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(LocalDate registration_date) {
        this.registration_date = registration_date;
    }

    public Set<Record> getRecords() {
        return records;
    }

    public void setRecords(Set<Record> records) {
        this.records = records;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String login) {
        this.username = login;
    }

    public String getPass() {
        return password;
    }

    public void setPass(String pass) {
        this.password = pass;
    }

    public UserRole getRole() {
        if (role == 1) {
            return UserRole.ROLE_ADMIN;
        } else if (role == 2) {
            return UserRole.ROLE_USER;
        } else if (role == 3){
           return UserRole.ROLE_GUEST;
        }else{
            return null;
        }
    }

    public void setRole(UserRole userRole) {
        if (userRole.equals(UserRole.ROLE_ADMIN)) {
            this.role = 1;
        } else if (userRole.equals(UserRole.ROLE_USER)) {
            this.role = 2;
        } else if (userRole.equals(UserRole.ROLE_GUEST)) {
            this.role = 3;
        }
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }
}