package tn.esprit.test.entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numRegistration;

    private int numWeek;

    @ManyToOne
    private Skier skier;  // Hibernate gère automatiquement la clé étrangère
}
