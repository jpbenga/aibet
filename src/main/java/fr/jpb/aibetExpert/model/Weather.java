package fr.jpb.aibetExpert.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Weather {
    private String description;
    private Double temperature;
}
