package fr.jpb.aibetExpert.repository;

import fr.jpb.aibetExpert.models.sports.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Long> {

    // Trouver un coach par son nom complet
    Optional<Coach> findByFirstNameAndLastName(String firstName, String lastName);

    // Trouver les coachs par leur prénom
    List<Coach> findByFirstName(String firstName);

    // Trouver les coachs par leur nom de famille
    List<Coach> findByLastName(String lastName);

    // Trouver les coachs par l'équipe qu'ils entraînent
    List<Coach> findByTeams_Name(String teamName); // Assuming 'name' is the attribute in your Team entity
}
