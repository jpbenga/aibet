package fr.jpb.aibetExpert.models.betting;

import fr.jpb.aibetExpert.enums.BetType;
import fr.jpb.aibetExpert.models.sports.Match;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "odd")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Odd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double value; // Valeur de la cote

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BetType typeBet; // Type de pari (enum)

    @ManyToOne
    @JoinColumn(name = "bookmaker_id", nullable = false)
    private Bookmaker bookmaker; // Bookmaker qui propose la cote

    @ManyToOne
    @JoinColumn(name = "match_id", nullable = false)
    private Match match;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    public double getValue() {
        return value;
    }
}
