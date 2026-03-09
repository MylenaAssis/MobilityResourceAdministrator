package br.com.mylena.cadastrodeveiculos.domain;

import br.com.mylena.cadastrodeveiculos.domain.shared.Propulsion;

import java.util.UUID;

public class Motorcycle extends MobilityResource {
    private String color;
    private Enum<Propulsion> propulsionType;
    private String useType;
    private int engineDisplacement;

    public Motorcycle(String modeInput, String type, String model, String color, Enum<Propulsion> propulsionType, String useType, int engineDisplacement) {
        super(modeInput, type, model);
        this.color = color;
        this.propulsionType = propulsionType;
        this.useType = useType;
        this.engineDisplacement = engineDisplacement;
    }
}
