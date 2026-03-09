package br.com.mylena.cadastrodeveiculos.dao;

import br.com.mylena.cadastrodeveiculos.dao.generic.GenericDAO;
import br.com.mylena.cadastrodeveiculos.domain.MobilityResource;

public class MobilityResourceDAO extends GenericDAO<MobilityResource> implements IMobilityResourceDAO {

    @Override
    public void delete(Long code) {

    }

    public String findByType(String type) {
        return "";
    }

    @Override
    public String findByCode(String code) {
        return "";
    }
}
