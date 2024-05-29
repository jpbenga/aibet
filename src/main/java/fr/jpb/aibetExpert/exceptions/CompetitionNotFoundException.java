package fr.jpb.aibetExpert.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) // Code d'erreur HTTP 404
public class CompetitionNotFoundException extends RuntimeException {

    public CompetitionNotFoundException(Long id) {
        super("Competition not found with ID: " + id);
    }

    public CompetitionNotFoundException(String message) {
        super(message);
    }
}
