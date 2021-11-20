package by.bsuir.grigorieva.olga.entity.criteria;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public class Query<Entity> {

    private final Class<? extends Entity> targetClass;
    private final Map<Criteria<?>, Object> criterias = new HashMap<>();

    public Query(Class<? extends Entity> targetClass) {
        this.targetClass = targetClass;
    }

    /**
     * Getter of target class
     * @return class of objects that query is looking for
     * */

    public Class<? extends Entity> getTargetClass() {
        return targetClass;
    }

    /**
     * Method for adding a criteria
     *
     * @param criteria - add search criteria as a key
     * @param value - value of criteria
     * @param <V> - type of value of criteria
     * @return this query
     * */

    public <V> Query<Entity> add(Criteria<V> criteria, V value) {
        if(!criteria.getValidator().isCorrect(value))
            throw new IllegalArgumentException("Value '" + value + "' is not suitable for '" + criteria + "' search criteria.");
        criterias.put(criteria, value);
        return this;
    }

    /**
     * @param entity object for checking
     * @return true if entity is fit to criteria
     * */

    public boolean isSuitable(Entity entity) {
        return targetClass.isAssignableFrom(entity.getClass()) &&
                criterias.keySet()
                        .stream()
                        .allMatch(
                                key -> key.getComparator().isSuitable(entity, criterias.get(key))
                        );
    }

}
