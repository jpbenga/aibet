package fr.jpb.aibetExpert.models.sports.abstractclass;

import fr.jpb.aibetExpert.enums.MatchStatus;
import fr.jpb.aibetExpert.models.sports.Referee;
import fr.jpb.aibetExpert.models.sports.Score;
import fr.jpb.aibetExpert.models.sports.Stadium;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "match_leg")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public abstract class MatchLeg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "match_id", nullable = false)
    private Match match;

    private boolean isHomeLeg;
    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    private MatchStatus status;

    @ManyToOne
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;

    @ManyToMany
    @JoinTable(
            name = "match_leg_referee",
            joinColumns = @JoinColumn(name = "match_leg_id"),
            inverseJoinColumns = @JoinColumn(name = "referee_id")
    )
    private Set<Referee> referees;

    // Méthode abstraite pour obtenir le score, à implémenter dans les classes filles
    public abstract Score getScore();
}
