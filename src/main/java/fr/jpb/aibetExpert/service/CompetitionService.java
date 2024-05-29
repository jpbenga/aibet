package fr.jpb.aibetExpert.service;

import fr.jpb.aibetExpert.enums.football.FootballCompetitionType;
import fr.jpb.aibetExpert.models.sports.Competition;

import java.util.List;
import java.util.Optional;

public interface CompetitionService {
    List<Competition> getAllCompetitions();
    Optional<Competition> getCompetitionById(Long id);
    Competition createCompetition(Competition competition);
    Competition updateCompetition(Competition competition);
    void deleteCompetition(Long id);
    Optional<Competition> findByName(String name);
    List<Competition> findByCountryId(Long countryId);
    List<Competition> findByType(FootballCompetitionType type);
    List<Competition> findByCountryIdAndType(Long countryId, FootballCompetitionType type);
}
