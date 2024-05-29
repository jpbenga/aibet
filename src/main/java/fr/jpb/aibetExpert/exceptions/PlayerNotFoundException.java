package fr.jpb.aibetExpert.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) // Code d'erreur HTTP 404
public class PlayerNotFoundException extends RuntimeException {

    public PlayerNotFoundException(Long id) {
        super("Player not found with id: " + id);
    }

    public PlayerNotFoundException(String message) {
        super(message);
    }
}
