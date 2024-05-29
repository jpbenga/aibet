package fr.jpb.aibetExpert.service.football.impl;

import fr.jpb.aibetExpert.enums.football.FootballPosition;
import fr.jpb.aibetExpert.exceptions.PlayerNotFoundException;
import fr.jpb.aibetExpert.models.sports.football.FootballPlayer;
import fr.jpb.aibetExpert.repository.football.FootballPlayerRepository;
import fr.jpb.aibetExpert.service.football.FootballPlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FootballPlayerServiceImpl implements FootballPlayerService {

    private final FootballPlayerRepository footballPlayerRepository;

    @Override
    public List<FootballPlayer> getAllFootballPlayers() {
        return footballPlayerRepository.findAll();
    }

    @Override
    public FootballPlayer getFootballPlayerById(Long id) {
        return footballPlayerRepository.findById(id)
                .orElseThrow(() -> new PlayerNotFoundException(id));
    }

    @Override
    public FootballPlayer createFootballPlayer(FootballPlayer footballPlayer) {
        return footballPlayerRepository.save(footballPlayer);
    }

    @Override
    public FootballPlayer updateFootballPlayer(FootballPlayer footballPlayer) {
        if (footballPlayerRepository.existsById(footballPlayer.getId())) {
            return footballPlayerRepository.save(footballPlayer);
        } else {
            throw new PlayerNotFoundException(footballPlayer.getId());
        }
    }

    @Override
    public void deleteFootballPlayer(Long id) {
        footballPlayerRepository.deleteById(id);
    }

    // Méthodes spécifiques pour la recherche de joueurs
    @Override
    public List<FootballPlayer> findPlayersByName(String firstName, String lastName) {
        return footballPlayerRepository.findByFirstNameContainingOrLastNameContaining(firstName, lastName);
    }

    @Override
    public List<FootballPlayer> findPlayersByTeamId(Long teamId) {
        return footballPlayerRepository.findByTeamId(teamId);
    }

    @Override
    public List<FootballPlayer> findPlayersByPosition(FootballPosition position) {
        return footballPlayerRepository.findByFootballPositionsContaining(position);
    }

    @Override
    public List<FootballPlayer> findPlayersByTeamIdAndPosition(Long teamId, FootballPosition position) {
        return footballPlayerRepository.findByTeamIdAndFootballPositionsContaining(teamId, position);
    }
}
