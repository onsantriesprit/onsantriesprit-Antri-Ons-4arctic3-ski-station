package tn.esprit.test.entities;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSub;

    private LocalDate startDate;
    private LocalDate endDate;
    private float price;

    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSub;
}
