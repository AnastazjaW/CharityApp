package pl.coderslab.charity.institution.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Institution.TABLE_NAME)
@Data
public class Institution {
    final static String TABLE_NAME = "institutions";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
}
