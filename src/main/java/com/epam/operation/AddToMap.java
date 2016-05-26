package com.epam.operation;

import java.util.Map;

/**
 * @author Olga Lashkevich
 */
public class AddToMap implements IOperation {

    private Map map;

    public AddToMap(Map map) {
        this.map = map;
    }

    public String getMessage() {
        return "add element to " + map.getClass().getSimpleName();
    }

    public void add(Object object) {
        map.put(object, object);

    }

    public void doOperation(Object object) {
        map.put(object, object);
    }
}
