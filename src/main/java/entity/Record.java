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
@Table(name = "records")
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "taken")
    private LocalDate taken;

    @Column(name = "returned")
    private LocalDate returned;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    @MapsId
    private User user;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @MapsId
    private BookInstance instance;


}
