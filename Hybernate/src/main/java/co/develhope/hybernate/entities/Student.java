package co.develhope.hybernate.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false, unique = true)
    private String email;

}
