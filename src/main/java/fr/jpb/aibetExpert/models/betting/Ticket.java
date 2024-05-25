package fr.jpb.aibetExpert.models.betting;

import fr.jpb.aibetExpert.models.User;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ticket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creation_date", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "total_amount", nullable = false)
    private Double totalAmount;

    @Column(name = "potential_gain")
    private Double potentialGain;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL)
    private List<Bet> bets;

    // Méthodes pour calculer le montant total et le gain potentiel
    public void calculateTotalAmount() {
        totalAmount = bets.stream()
                .mapToDouble(Bet::getAmount)
                .sum();
    }

    public void calculatePotentialGain() {
        potentialGain = bets.stream()
                .mapToDouble(bet -> bet.getOdd().getValue() * bet.getAmount())
                .sum();
    }
}
