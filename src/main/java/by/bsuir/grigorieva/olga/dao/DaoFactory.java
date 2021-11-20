package by.bsuir.grigorieva.olga.dao;

import by.bsuir.grigorieva.olga.dao.impl.ApplianceDao;
import by.bsuir.grigorieva.olga.entity.Appliance;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public final class DaoFactory {

    private static final DaoFactory instance = new DaoFactory();

    public static DaoFactory getInstance() {
        return instance;
    }

    private final Dao<Appliance> applianceDAO = new ApplianceDao();

    public Dao<Appliance> getApplianceDao() {
        return applianceDAO;
    }
}