package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table
public class BookInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "instance_id")
    private Long id;

    private Boolean available;

    @Column(name = "edition_year")
    private Integer editionYear;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "book_id")
    private Book book;

}
