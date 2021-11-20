package by.bsuir.grigorieva.olga.dao;

import by.bsuir.grigorieva.olga.entity.criteria.Query;

import java.util.List;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public interface Dao<T> {
    List<T> get(Query<? extends T> query);

    void save(T appliance);
}
