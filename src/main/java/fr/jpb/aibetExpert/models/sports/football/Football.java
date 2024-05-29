package fr.jpb.aibetExpert.models.sports.football;

import fr.jpb.aibetExpert.models.sports.abstractclass.Match;
import fr.jpb.aibetExpert.models.sports.abstractclass.Sport;

import java.util.List;

public class Football extends Sport {
    @Override
    public List<Match> getMatches() {
        return List.of();
    }

    @Override
    public int getNumberOfPlayersPerTeam() {
        return 11;
    }

    @Override
    public int getMatchDuration() {
        return 90;
    }

    @Override
    public String getRules() {
        return "Le football se joue avec deux équipes de 11 joueurs";
    }
}
