package fr.jpb.aibetExpert.models.sports.football.football_rules;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "football.rules")
@Getter
@Setter
public class FootballCompetitionRule {
    private int matchDuration;          // Durée du match en minutes (90 par défaut)
    private int numberOfPlayersPerTeam; // Nombre de joueurs par équipe (11 par défaut)
    private int pointsPerWin;           // Points pour une victoire
    private int pointsPerDraw;          // Points pour un match nul
    private int pointsPerLoss;          // Points pour une défaite
    private boolean extraTimeAllowed;   // Prolongations autorisées (oui/non)
    private boolean penaltyShootoutAllowed; // Tirs au but autorisés (oui/non)
    private boolean awayGoalsRule;      // Règle des buts à l'extérieur (oui/non)
    private int maxYellowCards;         // Nombre maximum de cartons jaunes avant expulsion
    private int maxRedCards;            // Nombre maximum de cartons rouges
    private int maxSubstitutions;       // Nombre maximum de remplacements par équipe

    // Autres règles spécifiques au football que vous pourriez ajouter :
    // - offsideRule (booléen) : Indique si la règle du hors-jeu est appliquée.
    // - goalLineTechnology (booléen) : Indique si la technologie sur la ligne de but est utilisée.
    // - var (booléen) : Indique si l'assistance vidéo à l'arbitrage (VAR) est utilisée.
    // - goldenGoalRule (booléen) : Indique si la règle du but en or est appliquée en prolongations.
    // - ...
}
