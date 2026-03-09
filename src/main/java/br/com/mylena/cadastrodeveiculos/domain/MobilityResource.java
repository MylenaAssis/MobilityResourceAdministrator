package br.com.mylena.cadastrodeveiculos.domain;

import br.com.mylena.cadastrodeveiculos.domain.shared.TransportMode;

import java.util.UUID;

public class MobilityResource {
    //Os modais de transporte são: rodoviário, ferroviário, aquaviário, aeroviário e dutoviário. Tipos: carro, moto, caminhão etc. Model se refe ao modelo do veículo que pretendemos cadastrar.
    private TransportMode mode;
    private String type;
    private String model;
    private UUID id;

    public MobilityResource(String modeInput, String type, String model) {
        TransportMode mode = TransportMode.valueOf(modeInput);
        this.id = UUID.randomUUID();
        this.mode = mode;
        this.type = type;
        this.model = model;
    }

    public String getMode() {
        return mode.name();
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public UUID getId() {
        return id;
    }
}
