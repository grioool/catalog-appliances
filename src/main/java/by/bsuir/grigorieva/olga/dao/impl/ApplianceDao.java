package by.bsuir.grigorieva.olga.dao.impl;

import by.bsuir.grigorieva.olga.dao.AbstractDao;
import by.bsuir.grigorieva.olga.entity.Appliance;
import by.bsuir.grigorieva.olga.entity.criteria.Query;

import java.io.IOException;
import java.util.List;

c

public class ApplianceDao extends AbstractDao<Appliance> {
    public ApplianceDao() {
        super("catalog-appliances.xml");
    }

    /**
     * @param query - search query
     * @return list of appliances that fit to query
     */

    @Override
    public List<Appliance> get(Query<? extends Appliance> query) {
        try {
            return getTransaction()
                    .specifyQuery(query)
                    .commit()
                    .getResult();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @param appliance - appliance for saving
     */

    @Override
    public void save(Appliance appliance) {
        try {
            getTransaction().save(appliance);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
