package fr.jpb.aibetExpert.models.sports.football;

import fr.jpb.aibetExpert.models.sports.Score;
import fr.jpb.aibetExpert.models.sports.abstractclass.MatchLeg;
import jakarta.persistence.*;

@Entity
@Table(name = "football_match_leg")
public class FootballMatchLeg extends MatchLeg {

    @Embedded
    private Score score;

    @Override
    public Score getScore() {
        return score;
    }
}
