package fr.jpb.aibetExpert.models.sports.football;

import fr.jpb.aibetExpert.enums.football.FootballPosition;
import fr.jpb.aibetExpert.models.sports.Team;
import fr.jpb.aibetExpert.models.sports.abstractclass.Person;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "football_player")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FootballPlayer extends Person {
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    private Integer number;

    @ElementCollection
    @CollectionTable(name = "player_position", joinColumns = @JoinColumn(name = "player_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "position")
    private Set<FootballPosition> footballPositions;
}
