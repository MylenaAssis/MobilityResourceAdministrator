package br.com.mylena.cadastrodeveiculos.dao.generic;

import java.util.Collection;

public interface IGenericDAO<T> {
    public Boolean register(T entity);
    public void delete(Long value);
}
