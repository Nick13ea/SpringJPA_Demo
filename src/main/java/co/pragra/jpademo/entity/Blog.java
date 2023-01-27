package co.pragra.jpademo.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "TABLE_BLOG")
@Data
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, length = 150)
    private String title;
    private String blogText;
    @OneToOne(cascade = CascadeType.ALL)
    private Category category;
    private Instant createDate;
    private Instant updateDate;
}
