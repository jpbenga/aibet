package fr.jpb.aibetExpert.models.sports.football;

import fr.jpb.aibetExpert.models.sports.abstractclass.Match;
import fr.jpb.aibetExpert.models.sports.Score;
import fr.jpb.aibetExpert.models.Weather;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "football_match")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FootballMatch extends Match {
    @Embedded
    private Score score;

    @Embedded
    private Weather weather;
}
