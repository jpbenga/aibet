package fr.jpb.aibetExpert.service;

import fr.jpb.aibetExpert.models.sports.Referee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface RefereeService {
    List<Referee> getAllReferees();
    Page<Referee> getAllReferees(Pageable pageable); // Pour la pagination
    Optional<Referee> getRefereeById(Long id);
    Referee saveReferee(Referee referee);
    void deleteReferee(Long id);

    // Méthodes spécifiques pour la recherche d'arbitres
    Optional<Referee> findByFirstNameAndLastName(String firstName, String lastName);
    List<Referee> findByFirstName(String firstName);
    List<Referee> findByLastName(String lastName);
    List<Referee> findByNationality_Name(String nationalityName);
    List<Referee> findByMatches_Id(Long matchId);
}
