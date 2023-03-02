package co.develhope.hybernate.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    private SchoolClass schoolClass;

}