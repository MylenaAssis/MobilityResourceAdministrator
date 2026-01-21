package br.com.mylena.cadastrodeveiculos.domain;

import br.com.mylena.cadastrodeveiculos.domain.shared.Propulsion;

public class Car extends MobilityResource {
    private String model;
    private String bodyType;
    private Long code;
    private String color;
    private Enum<Propulsion> propulsionType;
    private int trunkCapacity;
    private Boolean sunroof;
}
