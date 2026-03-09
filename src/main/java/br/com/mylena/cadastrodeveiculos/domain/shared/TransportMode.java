package br.com.mylena.cadastrodeveiculos.domain.shared;

import br.com.mylena.cadastrodeveiculos.dao.generic.IGenericDAO;

//enum não pode herdar porque ja tem herança de enum. Pode implementar interface.
public enum TransportMode {
    ROAD("Rodoviário", "01"),
    RAIL("Ferroviário", "02"),
    WATER("Aquaviário", "03"),
    AIR("Aeroviário", "04"),
    PIPELINE("Dutoviário", "05");

    private final String displayName;
    private final String id;

    TransportMode(String displayName, String id) {
        this.displayName = displayName;
        this.id = id;
    }
}
