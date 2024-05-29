package fr.jpb.aibetExpert.service.impl;

import fr.jpb.aibetExpert.exceptions.RefereeNotFoundException;
import fr.jpb.aibetExpert.models.sports.Referee;
import fr.jpb.aibetExpert.repository.RefereeRepository;
import fr.jpb.aibetExpert.service.RefereeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class RefereeServiceImpl implements RefereeService {

    private final RefereeRepository refereeRepository;

    @Override
    public List<Referee> getAllReferees() {
        return refereeRepository.findAll();
    }

    @Override
    public Page<Referee> getAllReferees(Pageable pageable) {
        return refereeRepository.findAll(pageable);
    }

    @Override
    public Optional<Referee> getRefereeById(Long id) {
        return refereeRepository.findById(id);
    }

    @Override
    public Referee saveReferee(Referee referee) {
        return refereeRepository.save(referee);
    }

    @Override
    public void deleteReferee(Long id) {
        refereeRepository.deleteById(id);
    }

    // Méthodes spécifiques pour la recherche d'arbitres

    @Override
    public Optional<Referee> findByFirstNameAndLastName(String firstName, String lastName) {
        return refereeRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public List<Referee> findByFirstName(String firstName) {
        return refereeRepository.findByFirstName(firstName);
    }

    @Override
    public List<Referee> findByLastName(String lastName) {
        return refereeRepository.findByLastName(lastName);
    }

    @Override
    public List<Referee> findByNationality_Name(String nationalityName) {
        return refereeRepository.findByNationality_Name(nationalityName);
    }

    @Override
    public List<Referee> findByMatches_Id(Long matchId) {
        return refereeRepository.findByMatches_Id(matchId);
    }
}
