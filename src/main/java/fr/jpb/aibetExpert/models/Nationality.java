package fr.jpb.aibetExpert.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "nationality")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Nationality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;
}
