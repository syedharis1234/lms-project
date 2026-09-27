package com.hitms.lms;

import java.util.LinkedHashMap;
import java.util.Map;

public class LibraryService {

    private final Map<String, Integer> catalogue = new LinkedHashMap<>();

    public int addBook(String title, int copies) {
        catalogue.merge(title, copies, Integer::sum);
        return catalogue.get(title);
    }

    public int returnBook(String title) {
        catalogue.merge(title, 1, Integer::sum);
        return catalogue.get(title);
    }

    public boolean removeBook(String title) {
        return catalogue.remove(title) != null;
    }

    public int copiesOf(String title) {
        return catalogue.getOrDefault(title, 0);
    }

    public Map<String, Integer> catalogue() {
        return Map.copyOf(catalogue);
    }
}
