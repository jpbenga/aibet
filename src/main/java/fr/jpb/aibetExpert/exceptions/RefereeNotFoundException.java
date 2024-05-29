package fr.jpb.aibetExpert.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) // Code d'erreur HTTP 404
public class RefereeNotFoundException extends RuntimeException {

    public RefereeNotFoundException(Long id) {
        super("Referee not found with ID: " + id);
    }

    public RefereeNotFoundException(String message) {
        super(message);
    }
}
