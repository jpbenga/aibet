package fr.jpb.aibetExpert.service.football.impl;

import fr.jpb.aibetExpert.models.sports.football.FootballMatch;
import fr.jpb.aibetExpert.repository.football.FootballMatchRepository;
import fr.jpb.aibetExpert.service.football.FootballMatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FootballMatchServiceImpl implements FootballMatchService {

    private final FootballMatchRepository footballMatchRepository;


    @Override
    public List<FootballMatch> getAllFootballMatches() {
        return footballMatchRepository.findAll();
    }

    @Override
    public FootballMatch getFootballMatchById(Long id) {
        return footballMatchRepository.findById(id).orElse(null);
    }

    @Override
    public FootballMatch createFootballMatch(FootballMatch footballMatch) {
        return footballMatchRepository.save(footballMatch);
    }

    @Override
    public FootballMatch updateFootballMatch(FootballMatch footballMatch) {
        if (footballMatchRepository.existsById(footballMatch.getId())) {
            return footballMatchRepository.save(footballMatch);
        } else {
            // Gérer le cas où le match n'existe pas (lever une exception, retourner null, etc.)
            return null;
        }
    }

    @Override
    public void deleteFootballMatch(Long id) {
        footballMatchRepository.deleteById(id);
    }

    // ... implémentation des autres méthodes spécifiques au football
}
