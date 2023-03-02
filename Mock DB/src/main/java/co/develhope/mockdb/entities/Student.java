package co.develhope.mockdb.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;

    private String lastName;

    @Column(unique = true, name = "email_student")
    private String email;

}