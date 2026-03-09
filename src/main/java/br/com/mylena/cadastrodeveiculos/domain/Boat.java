package br.com.mylena.cadastrodeveiculos.domain;

import br.com.mylena.cadastrodeveiculos.domain.shared.Propulsion;

import java.util.UUID;

public class Boat extends MobilityResource{
    private String model;
    private String color;
    private Enum<Propulsion> propulsionType;
    private String hullType;
    private double length;

    public Boat(String modeInput, String type, String model, String color, Enum<Propulsion> propulsionType, String hullType, double length) {
        super(modeInput, type, model);
        this.model = model;
        this.color = color;
        this.propulsionType = propulsionType;
        this.hullType = hullType;
        this.length = length;
    }
}
