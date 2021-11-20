package by.bsuir.grigorieva.olga.entity.criteria.entity;

import by.bsuir.grigorieva.olga.entity.Kettle;
import by.bsuir.grigorieva.olga.entity.criteria.Comparator;
import by.bsuir.grigorieva.olga.entity.criteria.Criteria;
import by.bsuir.grigorieva.olga.entity.criteria.Validator;

import java.util.Objects;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public class KettleCriteria<Entity> extends Criteria<Entity> {

    private KettleCriteria(Comparator comparator, Validator<Entity> validator) {
        super(comparator, validator);
    }

    public static final KettleCriteria<Integer> BODY_MATERIAL = new KettleCriteria<>(
            (kettle, value) -> Objects.equals(((Kettle) kettle).getBodyMaterial(), value),
            Validator.INTEGER_VALIDATOR
    );

    public static final KettleCriteria<String> BULB_MATERIAL = new KettleCriteria<>(
            (kettle, value) -> Objects.equals(((Kettle) kettle).getBulbMaterial(), value),
            Validator.STRING_VALIDATOR
    );

    public static final KettleCriteria<Integer> POWER_CONSUMPTION = new KettleCriteria<>(
            (kettle, value) -> Objects.equals(((Kettle) kettle).getPowerConsumption(), value),
            Validator.INTEGER_VALIDATOR
    );
}
