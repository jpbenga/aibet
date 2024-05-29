package fr.jpb.aibetExpert.models.sports.abstractclass;

import java.util.List;

public abstract class Sport {
    private String name;
    private String logo;

    // Méthode abstraite pour récupérer les matchs
    public abstract List<Match> getMatches();

    public abstract int getNumberOfPlayersPerTeam();
    public abstract int getMatchDuration();
    public abstract String getRules();
}
