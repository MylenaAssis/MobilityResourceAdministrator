package br.com.mylena.cadastrodeveiculos.domain.shared;

public enum Propulsion {
    ELETRIC("Propulsão elétrica"),
    FUEL("Propulsão a combustível"),
    HYBRID("Propulsão híbrida");

    private final String displayName;

    Propulsion(String displayName) {
        this.displayName = displayName;
    }
}
