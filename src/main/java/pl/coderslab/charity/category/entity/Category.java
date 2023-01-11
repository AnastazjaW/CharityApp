package pl.coderslab.charity.category.entity;

import lombok.Data;
import pl.coderslab.charity.institution.entity.Institution;

import javax.persistence.*;

@Entity
@Table(name = Category.TABLE_NAME)
@Data
public class Category {
    final static String TABLE_NAME = "categories";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

}
