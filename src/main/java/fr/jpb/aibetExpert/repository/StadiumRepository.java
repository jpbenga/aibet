package fr.jpb.aibetExpert.repository;

import fr.jpb.aibetExpert.models.sports.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface StadiumRepository extends JpaRepository<Stadium, Long> {

    // Trouver un stade par son nom
    Optional<Stadium> findByName(String name);

    // Trouver tous les stades avec une capacité supérieure à un seuil donné
    List<Stadium> findByCapacityGreaterThan(Integer capacity);

    // Trouver le stade d'une équipe donnée
    Optional<Stadium> findByTeamId(Long teamId);

    // Trouver tous les stades situés dans un pays donné (via la relation avec Team)
    List<Stadium> findByTeamCountryId(Long countryId);
}
