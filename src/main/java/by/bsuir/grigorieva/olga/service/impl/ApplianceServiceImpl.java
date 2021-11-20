package by.bsuir.grigorieva.olga.service.impl;

import by.bsuir.grigorieva.olga.dao.DaoFactory;
import by.bsuir.grigorieva.olga.entity.Appliance;
import by.bsuir.grigorieva.olga.entity.criteria.Query;
import by.bsuir.grigorieva.olga.service.ApplianceService;

import java.util.Comparator;
import java.util.List;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public class ApplianceServiceImpl implements ApplianceService {

    /**
     * @param query - search query
     * @return list of appliances that fit to query
     */

    @Override
    public List<Appliance> get(Query<Appliance> query) {
        return DaoFactory.getInstance().getApplianceDao().get(query);
    }

    /**
     * @return cheapest appliance
     */

    @Override
    public Appliance getCheapest() {
        return DaoFactory.getInstance()
                .getApplianceDao()
                .get(new Query<>(Appliance.class)).stream()
                .min(Comparator.comparing(Appliance::getPrice))
                .orElse(null);
    }

    /**
     * @param appliance object for saving
     */

    @Override
    public void save(Appliance appliance) {
        DaoFactory.getInstance().getApplianceDao().save(appliance);
    }
}
