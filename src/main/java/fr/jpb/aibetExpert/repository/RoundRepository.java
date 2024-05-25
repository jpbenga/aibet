package fr.jpb.aibetExpert.repository;

import fr.jpb.aibetExpert.models.sports.Round;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface RoundRepository extends JpaRepository<Round, Long> {

    // Trouver une journée par son numéro et sa saison
    Optional<Round> findByNumberAndSeasonId(int number, Long seasonId);

    // Trouver les journées d'une saison spécifique
    List<Round> findBySeasonId(Long seasonId);

    // Trouver les journées entre deux dates
    List<Round> findByStartDateBetween(LocalDate startDate, LocalDate endDate);

    // Trouver les journées à venir d'une saison (après une date donnée)
    List<Round> findBySeasonIdAndStartDateAfter(Long seasonId, LocalDate date);
}
