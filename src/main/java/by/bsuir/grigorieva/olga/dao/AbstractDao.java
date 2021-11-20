package by.bsuir.grigorieva.olga.dao;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public abstract class AbstractDao<Entity> implements Dao<Entity> {

    private final File source;

    public AbstractDao(String path) {
        source = new File(path);
    }

    /**
     * Method creates an instance of transaction
     *
     * @return new transaction from source
     * @throws FileNotFoundException if file was not found
     */

    public Transaction<Entity> getTransaction() throws FileNotFoundException {
        return new Transaction<>(source);
    }
}

