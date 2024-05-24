package fr.jpb.aibetExpert.enums;

public enum BetType {
    MONEYLINE("1N2"),
    SPREAD("Handicap"),
    OVER_UNDER("Plus/Moins"),
    BOTH_TEAMS_TO_SCORE("Les deux équipes marquent"),
    DRAW_NO_BET("Match nul remboursé"),
    CORRECT_SCORE("Score exact"),
    HALF_TIME_RESULT("Résultat mi-temps"),
    FIRST_GOALSCORER("Premier buteur"),
    ANYTIME_GOALSCORER("Buteur à tout moment"),
    NUMBER_OF_CORNERS("Nombre de corners"),
    NUMBER_OF_CARDS("Nombre de cartons"),
    PENALTY_SCORED("Penalty marqué"),
    OWN_GOAL("But contre son camp"),
    ;

    private final String label;

    BetType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
