package fr.jpb.aibetExpert.service.impl;

import fr.jpb.aibetExpert.enums.football.FootballCompetitionType;
import fr.jpb.aibetExpert.exceptions.CompetitionNotFoundException;
import fr.jpb.aibetExpert.models.sports.Competition;
import fr.jpb.aibetExpert.repository.CompetitionRepository;
import fr.jpb.aibetExpert.service.CompetitionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CompetitionServiceImpl implements CompetitionService {

    private final CompetitionRepository competitionRepository;

    @Override
    public List<Competition> getAllCompetitions() {
        return competitionRepository.findAll();
    }

    @Override
    public Optional<Competition> getCompetitionById(Long id) {
        return competitionRepository.findById(id);
    }

    @Override
    public Competition createCompetition(Competition competition) {
        return competitionRepository.save(competition);
    }

    @Override
    public Competition updateCompetition(Competition competition) {
        if (competitionRepository.existsById(competition.getId())) {
            return competitionRepository.save(competition);
        } else {
            throw new CompetitionNotFoundException("Competition with ID " + competition.getId() + " not found.");
        }
    }

    @Override
    public void deleteCompetition(Long id) {
        competitionRepository.deleteById(id);
    }

    @Override
    public Optional<Competition> findByName(String name) {
        return competitionRepository.findByName(name);
    }

    @Override
    public List<Competition> findByCountryId(Long countryId) {
        return competitionRepository.findByCountryId(countryId);
    }

    @Override
    public List<Competition> findByType(FootballCompetitionType type) {
        return competitionRepository.findByType(type);
    }

    @Override
    public List<Competition> findByCountryIdAndType(Long countryId, FootballCompetitionType type) {
        return competitionRepository.findByCountryIdAndType(countryId, type);
    }
}
