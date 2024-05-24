package fr.jpb.aibetExpert.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "bookmaker")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bookmaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name; // Nom du bookmaker (ex: "Unibet", "Betclic", etc.)

    @OneToMany(mappedBy = "bookmaker")
    private Set<Odd> odds; // Liste des cotes proposées par le bookmaker
}
