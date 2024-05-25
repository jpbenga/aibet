package fr.jpb.aibetExpert.models.sports;

import fr.jpb.aibetExpert.models.Country;
import fr.jpb.aibetExpert.models.sports.football.FootballPlayer;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "team")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name; // Nom de l'équipe

    @ManyToOne
    @JoinColumn(name = "league_id")
    private League league; // Ligue à laquelle appartient l'équipe

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country; // Pays de l'équipe


    @OneToMany(mappedBy = "homeTeam")
    private Set<Match> homeMatches;

    @OneToMany(mappedBy = "awayTeam")
    private Set<Match> awayMatches;

    @OneToMany(mappedBy = "team")
    private Set<Statistic> statistics;

    @Lob // Pour stocker une image en base de données
    private byte[] logo;

    @ManyToOne
    @JoinColumn(name = "coach_id")
    private Coach coach;

    @OneToMany(mappedBy = "team")
    private Set<FootballPlayer> players;

    @ManyToOne
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;
}
