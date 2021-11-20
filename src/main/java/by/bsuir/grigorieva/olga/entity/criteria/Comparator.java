package by.bsuir.grigorieva.olga.entity.criteria;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public interface Comparator<Entity> {
    boolean isSuitable(Entity entity, Object o);
}
