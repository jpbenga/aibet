package fr.jpb.aibetExpert.models.sports;

import fr.jpb.aibetExpert.enums.football.FootballStatisticType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "statistic")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Statistic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    @Enumerated(EnumType.STRING)
    private FootballStatisticType type;

    private Integer value;

    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;

    @ManyToOne
    @JoinColumn(name = "match_id")
    private Match match;
}
