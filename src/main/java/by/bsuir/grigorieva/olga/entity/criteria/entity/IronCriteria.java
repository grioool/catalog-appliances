package by.bsuir.grigorieva.olga.entity.criteria.entity;

import by.bsuir.grigorieva.olga.entity.Iron;
import by.bsuir.grigorieva.olga.entity.criteria.Comparator;
import by.bsuir.grigorieva.olga.entity.criteria.Criteria;
import by.bsuir.grigorieva.olga.entity.criteria.Validator;

import java.util.Objects;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public class IronCriteria<Field> extends Criteria<Field> {

        private IronCriteria(Comparator<Iron> comparator, Validator<Field> validator) {
                super(comparator, validator);
        }

        public static final IronCriteria<Integer> IRON_SOLE = new IronCriteria<>(
                (iron, value) -> Objects.equals(((Iron) iron).getIronSole(), value),
                Validator.INTEGER_VALIDATOR
        );

        public static final IronCriteria<String> STEAM_BOOST = new IronCriteria<>(
                (iron, value) -> Objects.equals(((Iron) iron).getSteamBoost(), value),
                Validator.STRING_VALIDATOR
        );

        public static final IronCriteria<Integer> POWER_CONSUMPTION = new IronCriteria<>(
                (iron, value) -> Objects.equals(((Iron) iron).getPowerConsumption(), value),
                Validator.INTEGER_VALIDATOR
        );
}
