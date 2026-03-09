package br.com.mylena.cadastrodeveiculos.dao.generic;

import br.com.mylena.cadastrodeveiculos.domain.MobilityResource;
import br.com.mylena.cadastrodeveiculos.domain.shared.TransportMode;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


//pattern facade
public abstract class GenericDAO<T extends MobilityResource> implements IGenericDAO<T> {
    //no segundo map temos o tipo de veículo e seu id
    //no terceiro temos o veículo e o seu id
    private Map<String, Map<String, Map<UUID, T>>> storage;

    //constructor garante que o map nunca inicialize null quando essa classe for instanciada. Evita nullpointer
    public GenericDAO() {
        this.storage = new HashMap<>();
    }

    @Override
    public Boolean register(T entity) {

        String transportMode = entity.getMode();
        String type = entity.getType();
        UUID id = entity.getId();

        storage
                .computeIfAbsent(transportMode, m -> new HashMap<>())
                .computeIfAbsent(type, t -> new HashMap<>())
                .put(id, entity);

        return true;
    }

    @Override
    public void delete(String value) {
    }
}
