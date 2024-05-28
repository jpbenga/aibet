package fr.jpb.aibetExpert.service.football;

import java.util.List;
import fr.jpb.aibetExpert.models.sports.football.FootballMatch;

public interface FootballMatchService {
    List<FootballMatch> getAllFootballMatches();
    FootballMatch getFootballMatchById(Long id);
    FootballMatch createFootballMatch(FootballMatch footballMatch);
    FootballMatch updateFootballMatch(FootballMatch footballMatch);
    void deleteFootballMatch(Long id);
}
