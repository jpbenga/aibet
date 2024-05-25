package fr.jpb.aibetExpert.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Weather {
    private String description;
    private Double temperature;
}
