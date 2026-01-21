package br.com.mylena.cadastrodeveiculos.domain;

import br.com.mylena.cadastrodeveiculos.domain.shared.Propulsion;

public class Boat extends MobilityResource{
    private String model;
    private Long code;
    private String color;
    private Enum<Propulsion> propulsionType;

    private String hullType;
    private double length;
}
