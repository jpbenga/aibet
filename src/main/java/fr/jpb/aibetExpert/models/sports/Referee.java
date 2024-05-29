package fr.jpb.aibetExpert.models.sports;

import fr.jpb.aibetExpert.models.sports.abstractclass.Match;
import fr.jpb.aibetExpert.models.sports.abstractclass.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "referee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Referee extends Person {
    @ManyToMany(mappedBy = "referees")
    private Set<Match> matches;
}
