package fr.jpb.aibetExpert.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) // Code d'erreur HTTP 404
public class LeagueNotFoundException extends RuntimeException {

    public LeagueNotFoundException(Long id) {
        super("League not found with ID: " + id);
    }

    public LeagueNotFoundException(String message) {
        super(message);
    }
}
