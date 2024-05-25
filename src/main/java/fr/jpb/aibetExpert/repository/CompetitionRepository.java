package fr.jpb.aibetExpert.repository;

import fr.jpb.aibetExpert.enums.football.FootballCompetitionType;
import fr.jpb.aibetExpert.models.sports.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition, Long> {

    // Find by name
    Optional<Competition> findByName(String name);

    // Find by country
    List<Competition> findByCountryId(Long countryId);

    // Find by type
    List<Competition> findByType(FootballCompetitionType type);

    // Find by country and type
    List<Competition> findByCountryIdAndType(Long countryId, FootballCompetitionType type);
}
