package br.com.mylena.cadastrodeveiculos.domain;

import br.com.mylena.cadastrodeveiculos.domain.shared.Propulsion;

import java.util.UUID;

public class Truck extends MobilityResource {
    private String color;
    private Enum<Propulsion> propulsionType;
    private int loadCapacity;
    private int axles;

    public Truck(String modeInput, String type, String model, String color, Enum<Propulsion> propulsionType, int loadCapacity, int axles) {
        super(modeInput, type, model);
        this.color = color;
        this.propulsionType = propulsionType;
        this.loadCapacity = loadCapacity;
        this.axles = axles;
    }
}
