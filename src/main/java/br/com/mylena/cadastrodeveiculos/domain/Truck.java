package br.com.mylena.cadastrodeveiculos.domain;

import br.com.mylena.cadastrodeveiculos.domain.shared.Propulsion;

public class Truck extends MobilityResource {
    private String model;
    private Long code;
    private String color;
    private Enum<Propulsion> propulsionType;
    private int loadCapacity;
    private int axles;
}
