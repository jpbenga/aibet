package fr.jpb.aibetExpert.models.betting;

import fr.jpb.aibetExpert.enums.BetStatus;
import fr.jpb.aibetExpert.enums.BetType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "odd_id", nullable = false)
    private Odd odd;

    @ManyToOne
    @JoinColumn(name = "ticket_id", nullable = false)
    private Ticket ticket;

    @Column(nullable = false)
    private Double amount;

    @Enumerated(EnumType.STRING)
    private BetStatus status;

    @Enumerated(EnumType.STRING)
    private BetType type;

    public Double getAmount() {
        return amount;
    }

    public Odd getOdd() {
        return odd;
    }
}
