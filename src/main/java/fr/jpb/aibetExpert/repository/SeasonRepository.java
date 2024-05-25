package fr.jpb.aibetExpert.repository;

import fr.jpb.aibetExpert.models.sports.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface SeasonRepository extends JpaRepository<Season, Long> {

    // Trouver une saison par année et compétition
    Optional<Season> findByYearAndCompetitionId(Integer year, Long competitionId);

    // Trouver les saisons d'une ligue spécifique
    List<Season> findByLeagueId(Long leagueId);

    // Trouver les saisons d'une compétition spécifique
    List<Season> findByCompetitionId(Long competitionId);

    // Trouver les saisons en cours à une date donnée
    List<Season> findByStartDateBeforeAndEndDateAfter(LocalDate date);
}
