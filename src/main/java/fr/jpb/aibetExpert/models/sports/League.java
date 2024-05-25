package fr.jpb.aibetExpert.models.sports;

import fr.jpb.aibetExpert.models.Country;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "league")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany(mappedBy = "league")
    private List<Team> teams;

    @OneToMany(mappedBy = "league")
    private List<Season> seasons;
}
