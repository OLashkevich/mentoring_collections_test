package com.epam.operation;

import java.util.Map;

/**
 * @author Olga Lashkevich
 */
public class RemoveFromMap implements IOperation {

    private Map map;

    public RemoveFromMap(Map map) {
        this.map = map;
    }

    public String getMessage() {
        return "Remove from " + map.getClass().getSimpleName();
    }

    public void add(Object object) {
        map.put(object, object);

    }

    public void doOperation(Object object) {
        map.remove(object);

    }
}
