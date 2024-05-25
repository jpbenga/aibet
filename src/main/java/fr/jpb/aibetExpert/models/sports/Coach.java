package fr.jpb.aibetExpert.models.sports;

import fr.jpb.aibetExpert.models.sports.abstractclass.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "coach")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Coach extends Person {
    @OneToMany(mappedBy = "coach")
    private Set<Team> teams;
}
