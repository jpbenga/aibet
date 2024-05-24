package fr.jpb.aibetExpert.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "referee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Referee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "nationality_id")
    private Nationality nationality;

    @ManyToMany(mappedBy = "referees")
    private Set<Match> matches;
}
