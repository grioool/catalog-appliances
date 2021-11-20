package by.bsuir.grigorieva.olga.entity.criteria;

import java.util.Objects;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public interface Validator<Entity> {
        Validator<Integer> INTEGER_VALIDATOR = value -> Objects.nonNull(value) && value > 0;
        Validator<String> STRING_VALIDATOR = Objects::nonNull;

        boolean isCorrect(Entity value);
}
