package fr.jpb.aibetExpert.service;

import fr.jpb.aibetExpert.models.sports.League;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface LeagueService {
    List<League> getAllLeagues();
    Optional<League> getLeagueById(Long id);
    League saveLeague(League league);
    void deleteLeague(Long id);

    // Méthodes spécifiques pour la recherche de ligues
    Optional<League> findByName(String name);
    List<League> findByCountryId(Long countryId);
    Optional<League> findByCountryIdAndName(Long countryId, String name);
}
