package br.com.mylena.cadastrodeveiculos.domain;

import java.util.UUID;

public class Bicycle extends MobilityResource {
    private String model;
    private String color;
    private String bikeType;

    private Boolean hasGears;

    public Bicycle(String modeInput, String type, String model, String color, String bikeType, Boolean hasGears) {
        super(modeInput, type, model);
        this.model = model;
        this.color = color;
        this.bikeType = bikeType;
        this.hasGears = hasGears;
    }
}
