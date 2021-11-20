package by.bsuir.grigorieva.olga.entity.criteria.entity;

import by.bsuir.grigorieva.olga.entity.Fridge;
import by.bsuir.grigorieva.olga.entity.criteria.Comparator;
import by.bsuir.grigorieva.olga.entity.criteria.Validator;
import by.bsuir.grigorieva.olga.entity.criteria.Criteria;

import java.util.Objects;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public class FridgeCriteria<Entity> extends Criteria<Entity> {

        private FridgeCriteria(Comparator comparator, Validator<Entity> validator) {
                super(comparator, validator);
        }

        public static final FridgeCriteria<Integer> NUMBER_OF_SHELVES = new FridgeCriteria<>(
                (fridge, value) -> Objects.equals(((Fridge) fridge).getNumberOfShelves(), value),
                Validator.INTEGER_VALIDATOR
        );

        public static final FridgeCriteria<String> CONSTRUCT = new FridgeCriteria<>(
                (fridge, value) -> Objects.equals(((Fridge) fridge).getConstruct(), value),
                Validator.STRING_VALIDATOR
        );

        public static final FridgeCriteria<Integer> POWER_CONSUMPTION = new FridgeCriteria<>(
                (fridge, value) -> Objects.equals(((Fridge) fridge).getPowerConsumption(), value),
                Validator.INTEGER_VALIDATOR
        );
}
