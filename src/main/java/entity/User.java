package entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    private String name;
    private String phone;
    private LocalDate birth_date;
    private LocalDate registration_date;
    private Role role;
    private String login;
    private String pass;
    @OneToOne(mappedBy = "user")
    Record record;
}
