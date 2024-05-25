package fr.jpb.aibetExpert.models.sports;

import jakarta.persistence.Embeddable;

@Embeddable
public class Score {
    private Integer homeScore;
    private Integer awayScore;
    private Integer halftimeHomeScore;
    private Integer halftimeAwayScore;

    // Méthodes utilitaires (optionnel)
    public Integer getTotalScore() {
        return homeScore + awayScore;
    }

    public Integer getGoalDifference() {
        return homeScore - awayScore;
    }
}
