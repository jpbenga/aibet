package fr.jpb.aibetExpert.service.impl;

import fr.jpb.aibetExpert.exceptions.LeagueNotFoundException;
import fr.jpb.aibetExpert.models.sports.League;
import fr.jpb.aibetExpert.repository.LeagueRepository;
import fr.jpb.aibetExpert.service.LeagueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class LeagueServiceImpl implements LeagueService {

    private final LeagueRepository leagueRepository;

    @Override
    public List<League> getAllLeagues() {
        return leagueRepository.findAll();
    }

    @Override
    public Optional<League> getLeagueById(Long id) {
        return leagueRepository.findById(id);
    }

    @Override
    public League saveLeague(League league) {
        return leagueRepository.save(league);
    }

    @Override
    public void deleteLeague(Long id) {
        leagueRepository.deleteById(id);
    }

    // Méthodes spécifiques pour la recherche de ligues

    @Override
    public Optional<League> findByName(String name) {
        return leagueRepository.findByName(name);
    }

    @Override
    public List<League> findByCountryId(Long countryId) {
        return leagueRepository.findByCountryId(countryId);
    }

    @Override
    public Optional<League> findByCountryIdAndName(Long countryId, String name) {
        return leagueRepository.findByCountryIdAndName(countryId, name);
    }
}
