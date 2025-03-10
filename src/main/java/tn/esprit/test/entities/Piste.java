package tn.esprit.test.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;

    private String namePiste;
    private int length;
    private int slope;

    @Enumerated(EnumType.STRING)
    private Color color;

    @ManyToMany(mappedBy = "pistes")
    private Set<Skier> skiers;

}
