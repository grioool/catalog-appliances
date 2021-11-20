package by.bsuir.grigorieva.olga.dao;

import by.bsuir.grigorieva.olga.entity.criteria.Query;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public class Transaction<Entity> {

    private final File source;

    private final XmlMapper xmlMapper;

    private Scanner scanner;

    private Query query;

    private List<Entity> result;

    private boolean isCommitted;

    public Transaction(File source) {
        this.source = source;
        this.isCommitted = false;
        this.xmlMapper = new XmlMapper();
    }

    /**
     * @param value - value for saving
     */

    public void save(Object value) throws IOException {
        Files.write(
                source.toPath(),
                (xmlMapper.writeValueAsString(value) + "\n").getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.APPEND
        );
    }

    /**
     * @param query - query for searching
     * @return instance of this transaction
     * @throws FileNotFoundException if file not found
     */

    public Transaction<Entity> specifyQuery(Query<? extends Entity> query) throws FileNotFoundException {
        if (query == null)
            throw new IllegalArgumentException("Query is not specified.");

        this.query = query;
        this.scanner = new Scanner(source);
        return this;
    }

    /**
     * @return instance of this transaction
     */

    public Transaction<Entity> commit() {
        result = new ArrayList<>();
        while (scanner.hasNextLine()) {
            try {
                String xmlValue = scanner.nextLine();
                Object value = xmlMapper.readValue(xmlValue, query.getTargetClass());
                if (query.isSuitable(value))
                    result.add((Entity) value);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
        isCommitted = true;
        return this;
    }

    /**
     * @return instance of this transaction
     */

    public List<Entity> getResult() {
        return result;
    }
}
