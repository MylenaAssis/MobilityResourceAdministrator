package br.com.mylena.cadastrodeveiculos.domain;

import br.com.mylena.cadastrodeveiculos.domain.shared.Propulsion;

import java.util.UUID;

public class Car extends MobilityResource {
    private String model;
    private String bodyType;
    private String color;
    private Enum<Propulsion> propulsionType;
    private int trunkCapacity;
    private Boolean sunroof;

    public Car(String modeInput, String type, String model, String bodyType, String color, Enum<Propulsion> propulsionType, int trunkCapacity, Boolean sunroof) {
        super(modeInput, type, model);
        this.model = model;
        this.bodyType = bodyType;
        this.color = color;
        this.propulsionType = propulsionType;
        this.trunkCapacity = trunkCapacity;
        this.sunroof = sunroof;
    }
}
