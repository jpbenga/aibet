package fr.jpb.aibetExpert.repository.football;

import fr.jpb.aibetExpert.models.sports.football.FootballMatch;
import fr.jpb.aibetExpert.enums.MatchStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FootballMatchRepository extends JpaRepository<FootballMatch, Long> {
    // Trouver les matchs par équipe à domicile
    List<FootballMatch> findByHomeTeamId(Long teamId);

    // Trouver les matchs par équipe à l'extérieur
    List<FootballMatch> findByAwayTeamId(Long teamId);

    // Trouver les matchs par statut
    List<FootballMatch> findByStatus(MatchStatus status);

    // Trouver les matchs par ligue et saison (vous aurez besoin d'ajouter ces relations dans FootballMatch)
    //List<FootballMatch> findByLeagueIdAndSeasonId(Long leagueId, Long seasonId);

    // Trouver les matchs par date
    List<FootballMatch> findByDateBetween(LocalDateTime startDate, LocalDateTime endDate);

    // Requêtes sur les scores (en utilisant la classe embarquée Score)
    List<FootballMatch> findByScoreHomeScoreGreaterThan(Integer homeScore);
    List<FootballMatch> findByScoreAwayScoreGreaterThan(Integer awayScore);
    List<FootballMatch> findByScoreTotalScoreGreaterThan(Integer totalScore);
    // ... autres requêtes sur les scores
}
