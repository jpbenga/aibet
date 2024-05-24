package fr.jpb.aibetExpert.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "stadium")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stadium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name; // Nom du stade

    @Column(precision = 10, scale = 8) // Stockage précis des coordonnées géographiques
    private Double longitude;

    @Column(precision = 10, scale = 8)
    private Double latitude;

    // Optionnel : capacité du stade
    private Integer capacity;

    // Relation avec les matchs joués dans le stade
    @OneToMany(mappedBy = "stadium")
    private Set<Match> matches;

    @OneToOne(mappedBy = "stadium")
    private Team team;
}
