package fr.jpb.aibetExpert.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) // Code d'erreur HTTP 404
public class CoachNotFoundException extends RuntimeException {

    public CoachNotFoundException(Long id) {
        super("Coach not found with ID: " + id);
    }
}
