package by.bsuir.grigorieva.olga.entity.criteria;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public abstract class Criteria<Entity> {

    private final Comparator comparer;
    private final Validator<Entity> validator;

    public Criteria(Comparator comparer, Validator<Entity> valueValidator) {
        this.comparer = comparer;
        this.validator = valueValidator;
    }

    public Comparator getComparator() {
        return comparer;
    }

    public Validator<Entity> getValidator() {
        return validator;
    }
}
