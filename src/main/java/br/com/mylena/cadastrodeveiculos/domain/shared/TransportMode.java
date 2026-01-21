package br.com.mylena.cadastrodeveiculos.domain.shared;

public enum TransportMode {
    ROAD("Rodoviário"),
    RAIL("Ferroviário"),
    WATER("Aquaviário"),
    AIR("Aeroviário"),
    PIPELINE("Dutoviário");

    private final String displayName;

    TransportMode(String displayName) {
        this.displayName = displayName;
    }

}
