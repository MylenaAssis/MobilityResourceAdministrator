package br.com.mylena.cadastrodeveiculos.dao;

import br.com.mylena.cadastrodeveiculos.dao.generic.IGenericDAO;
import br.com.mylena.cadastrodeveiculos.domain.MobilityResource;

public interface IMobilityResourceDAO extends IGenericDAO<MobilityResource> {
    public Boolean register(MobilityResource mobilityResource);
    public String findByType(String type);

    public void delete(Long code);
}
