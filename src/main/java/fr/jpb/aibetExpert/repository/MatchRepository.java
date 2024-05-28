package fr.jpb.aibetExpert.repository;

import fr.jpb.aibetExpert.enums.MatchStatus;
import fr.jpb.aibetExpert.models.sports.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

    // Trouver un match par son ID
    Optional<Match> findById(Long id);

    // Trouver les matchs d'une équipe (à domicile ou à l'extérieur)
    List<Match> findByHomeTeamIdOrAwayTeamId(Long teamId1, Long teamId2);

    // Trouver les matchs par statut
    List<Match> findByMatchStatus(MatchStatus status);

    // Trouver les matchs par stade
    List<Match> findByStadiumId(Long stadiumId);

    // Trouver les matchs par arbitre
    List<Match> findByRefereesId(Long refereeId);

    // Trouver les matchs entre deux dates
    List<Match> findByDateBetween(LocalDateTime startDate, LocalDateTime endDate);

    // Trouver les matchs à venir d'une équipe (à domicile ou à l'extérieur)
    List<Match> findByHomeTeamIdOrAwayTeamIdAndDateAfter(Long teamId1, Long teamId2, LocalDateTime date);

    // Requêtes sur les scores (en utilisant la classe embarquée Score)
    List<Match> findByScoreHomeScoreGreaterThan(Integer homeScore);
    List<Match> findByScoreAwayScoreGreaterThan(Integer awayScore);
    List<Match> findByScoreTotalScoreGreaterThan(Integer totalScore);
}
