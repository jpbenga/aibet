package fr.jpb.aibetExpert.service;

import fr.jpb.aibetExpert.models.sports.Coach;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CoachService {

    List<Coach> getAllCoaches();
    Optional<Coach> getCoachById(Long id);
    Coach saveCoach(Coach coach);
    void deleteCoach(Long id);

    // Méthodes spécifiques pour la recherche de coachs
    Optional<Coach> findByFirstNameAndLastName(String firstName, String lastName);
    List<Coach> findByFirstName(String firstName);
    List<Coach> findByLastName(String lastName);
    List<Coach> findByTeams_Name(String teamName);
}
