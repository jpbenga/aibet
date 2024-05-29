package fr.jpb.aibetExpert.service.impl;

import fr.jpb.aibetExpert.exceptions.CoachNotFoundException;
import fr.jpb.aibetExpert.models.sports.Coach;
import fr.jpb.aibetExpert.repository.CoachRepository;
import fr.jpb.aibetExpert.service.CoachService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CoachServiceImpl implements CoachService {

    private final CoachRepository coachRepository;

    @Override
    public List<Coach> getAllCoaches() {
        return coachRepository.findAll();
    }

    @Override
    public Optional<Coach> getCoachById(Long id) {
        return coachRepository.findById(id);
    }

    @Override
    public Coach saveCoach(Coach coach) {
        return coachRepository.save(coach);
    }

    @Override
    public void deleteCoach(Long id) {
        coachRepository.deleteById(id);
    }

    // Méthodes spécifiques pour la recherche de coachs

    @Override
    public Optional<Coach> findByFirstNameAndLastName(String firstName, String lastName) {
        return coachRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public List<Coach> findByFirstName(String firstName) {
        return coachRepository.findByFirstName(firstName);
    }

    @Override
    public List<Coach> findByLastName(String lastName) {
        return coachRepository.findByLastName(lastName);
    }

    @Override
    public List<Coach> findByTeams_Name(String teamName) {
        return coachRepository.findByTeams_Name(teamName);
    }
}
