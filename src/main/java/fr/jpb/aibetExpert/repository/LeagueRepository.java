package fr.jpb.aibetExpert.repository;

import fr.jpb.aibetExpert.models.sports.League;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LeagueRepository extends JpaRepository<League, Long> {
    // Trouver une ligue par son nom
    Optional<League> findByName(String name);

    // Trouver les ligues par pays
    List<League> findByCountryId(Long countryId);

    // Trouver les ligues par pays et par nom
    Optional<League> findByCountryIdAndName(Long countryId, String name);
}
