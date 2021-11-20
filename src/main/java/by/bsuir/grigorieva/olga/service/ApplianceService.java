package by.bsuir.grigorieva.olga.service;

import by.bsuir.grigorieva.olga.entity.Appliance;
import by.bsuir.grigorieva.olga.entity.criteria.Query;

import java.util.List;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public interface ApplianceService {
    List<Appliance> get(Query<Appliance> query);

    Appliance getCheapest();

    void save(Appliance appliance);
}
