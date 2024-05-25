package fr.jpb.aibetExpert.repository;

import fr.jpb.aibetExpert.models.sports.abstractclass.Person;
import fr.jpb.aibetExpert.models.sports.Referee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RefereeRepository extends JpaRepository<Referee, Long> {
    // Trouver un arbitre par son nom complet
    Optional<Referee> findByFirstNameAndLastName(String firstName, String lastName);

    // Trouver les arbitres par leur prénom
    List<Referee> findByFirstName(String firstName);

    // Trouver les arbitres par leur nom de famille
    List<Referee> findByLastName(String lastName);

    // Trouver les arbitres par nationalité
    List<Referee> findByNationality_Name(String nationalityName);

    // Trouver les arbitres qui ont officié un match spécifique
    List<Referee> findByMatches_Id(Long matchId);
}
