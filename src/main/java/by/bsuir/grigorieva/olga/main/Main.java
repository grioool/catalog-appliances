package by.bsuir.grigorieva.olga.main;


import by.bsuir.grigorieva.olga.dao.DaoFactory;
import by.bsuir.grigorieva.olga.entity.Appliance;
import by.bsuir.grigorieva.olga.entity.Kettle;
import by.bsuir.grigorieva.olga.service.ServiceFactory;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public class Main {

    public static void main(String[] args) {
        Kettle kettle1 = new Kettle(50,"Samsung", 30, 50, "al", "al", 30);
        Kettle kettle2 = new Kettle(20,"LG", 30, 50, "al", "al", 30);
        Kettle kettle3 = new Kettle(10000,"DYSON", 30, 50, "al", "al", 30);

        DaoFactory.getInstance().getApplianceDao().save(kettle1);
        DaoFactory.getInstance().getApplianceDao().save(kettle2);
        DaoFactory.getInstance().getApplianceDao().save(kettle3);

        System.out.println("Test cheapest:");
        Appliance appliance = ServiceFactory
                .getInstance()
                .getApplianceService()
                .getCheapest();
        Printer.printApplianceInfo(appliance);
    }
}

