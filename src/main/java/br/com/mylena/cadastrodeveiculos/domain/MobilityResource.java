package br.com.mylena.cadastrodeveiculos.domain;

import br.com.mylena.cadastrodeveiculos.domain.shared.TransportMode;

public class MobilityResource {
    //Distinguem-se entre aéreos, terrestres e aquáticos. Os modais de transporte são: rodoviário, ferroviário, aquaviário, aeroviário e dutoviário.
    private Enum<TransportMode> mode;
    private String name;

    public MobilityResource(String mode, String name) {
        this.mode = mode;
        this.name = name;
    }
}
