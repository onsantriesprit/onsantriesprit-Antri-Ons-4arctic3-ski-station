package tn.esprit.test.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInstructor;

    private String firstName;
    private String lastName;

    @ManyToMany
    Set<Course> courses;
}
