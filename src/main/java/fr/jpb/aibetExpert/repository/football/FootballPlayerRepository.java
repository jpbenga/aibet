package fr.jpb.aibetExpert.repository.football;

import fr.jpb.aibetExpert.enums.football.FootballPosition;
import fr.jpb.aibetExpert.models.sports.football.FootballPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FootballPlayerRepository extends JpaRepository<FootballPlayer, Long> {
    // Trouver les joueurs par nom (prénom ou nom de famille)
    List<FootballPlayer> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);

    // Trouver les joueurs par équipe
    List<FootballPlayer> findByTeamId(Long teamId);

    // Trouver les joueurs par position
    List<FootballPlayer> findByFootballPositionsContaining(FootballPosition position);

    // Trouver les joueurs par équipe et position
    List<FootballPlayer> findByTeamIdAndFootballPositionsContaining(Long teamId, FootballPosition position);
}
