package fr.jpb.aibetExpert.models.sports;

import fr.jpb.aibetExpert.enums.football.FootballCompetitionType;
import fr.jpb.aibetExpert.models.Country;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Table(name = "competition")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name; // Nom de la compétition (Ligue 1, Ligue des Champions, etc.)

    @Enumerated(EnumType.STRING)
    private FootballCompetitionType type; // Type de compétition (CHAMPIONNAT, COUPE, etc.)

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany(mappedBy = "competition")
    private Set<Season> seasons;

    @Lob
    private byte[] logo;
}
