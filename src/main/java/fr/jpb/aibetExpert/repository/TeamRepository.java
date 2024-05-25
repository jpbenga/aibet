package fr.jpb.aibetExpert.repository;

import fr.jpb.aibetExpert.models.sports.League;
import fr.jpb.aibetExpert.models.sports.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    // Trouver une équipe par son nom
    Optional<Team> findByName(String name);

    // Trouver les équipes d'une ligue
    List<Team> findByLeague(League league);

    // Trouver les équipes d'un pays
    List<Team> findByCountryId(Long countryId);

    // Trouver les équipes par nom de ligue
    List<Team> findByLeagueName(String leagueName);

    // Trouver les équipes par nom de pays
    List<Team> findByCountryName(String countryName);

    // Recherche paginée d'équipes par nom (avec pagination et tri)
    Page<Team> findByNameContaining(String name, Pageable pageable);
}
