package fr.jpb.aibetExpert.models;

import fr.jpb.aibetExpert.models.sports.Team;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "country")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "iso_code", length = 2, unique = true)
    private String isoCode;

    @OneToMany(mappedBy = "country")
    private Set<Team> teams;

    @OneToMany(mappedBy = "country")
    private Set<Nationality> nationalities;
}

