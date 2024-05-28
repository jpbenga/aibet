package fr.jpb.aibetExpert.models.sports.abstractclass;

import fr.jpb.aibetExpert.enums.MatchStatus;
import fr.jpb.aibetExpert.models.sports.Referee;
import fr.jpb.aibetExpert.models.sports.Stadium;
import fr.jpb.aibetExpert.models.sports.Team;
import fr.jpb.aibetExpert.models.betting.Bet;
import fr.jpb.aibetExpert.models.sports.Round;
import fr.jpb.aibetExpert.models.sports.Season;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@MappedSuperclass
@Table(name = "match")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "home_team_id", nullable = false)
    private Team homeTeam;

    @ManyToOne
    @JoinColumn(name = "away_team_id", nullable = false)
    private Team awayTeam;

    @OneToMany(mappedBy = "match")
    private Set<Bet> bets;

    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    private MatchStatus status;

    private boolean hasExtraTime;

    private boolean hasPenaltyShootout;

    @OneToMany(mappedBy = "match", cascade = CascadeType.ALL)
    private Set<MatchLeg> legs;

    @ManyToOne
    @JoinColumn(name = "round_id")
    private Round round;

    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;

    @ManyToOne
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;

    @ManyToMany
    @JoinTable(
            name = "match_referee",
            joinColumns = @JoinColumn(name = "match_id"),
            inverseJoinColumns = @JoinColumn(name = "referee_id")
    )
    private Set<Referee> referees;
}
