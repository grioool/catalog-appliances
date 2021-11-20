package by.bsuir.grigorieva.olga.service;


import by.bsuir.grigorieva.olga.service.impl.ApplianceServiceImpl;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    private final ApplianceServiceImpl applianceService = new ApplianceServiceImpl();

    private ServiceFactory() {}

    public ApplianceServiceImpl getApplianceService() {

        return applianceService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }
}
