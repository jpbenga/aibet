package fr.jpb.aibetExpert.service.football;

import fr.jpb.aibetExpert.enums.football.FootballPosition;
import fr.jpb.aibetExpert.models.sports.football.FootballPlayer;

import java.util.List;

public interface FootballPlayerService {
    List<FootballPlayer> getAllFootballPlayers();
    FootballPlayer getFootballPlayerById(Long id);
    FootballPlayer createFootballPlayer(FootballPlayer footballPlayer);
    FootballPlayer updateFootballPlayer(FootballPlayer footballPlayer);
    void deleteFootballPlayer(Long id);

    // Méthodes spécifiques pour la recherche de joueurs
    List<FootballPlayer> findPlayersByName(String firstName, String lastName);
    List<FootballPlayer> findPlayersByTeamId(Long teamId);
    List<FootballPlayer> findPlayersByPosition(FootballPosition position);
    List<FootballPlayer> findPlayersByTeamIdAndPosition(Long teamId, FootballPosition position);
}
