package br.com.mylena.cadastrodeveiculos.dao;

import br.com.mylena.cadastrodeveiculos.dao.generic.GenericDAO;
import br.com.mylena.cadastrodeveiculos.domain.MobilityResource;

public class MobilityResourceDAO extends GenericDAO<MobilityResource> implements IMobilityResourceDAO {

//    @Override
//    public Class<MobilityResource> getClassType() {
//        //esperado responder qual é o modal
//        return MobilityResource.class;
//    }

    @Override
    public void delete(Long code) {

    }

    @Override
    public String findByCode(String code) {
        return "";
    }
}
