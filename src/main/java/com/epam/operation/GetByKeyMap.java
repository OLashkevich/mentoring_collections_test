package com.epam.operation;

import java.util.Map;

/**
 * @author Olga Lashkevich
 */
public class GetByKeyMap implements IOperation {

    private Map map;

    public GetByKeyMap(Map map) {
        this.map = map;
    }


    public String getMessage() {
        return "Get element by index from " + map.getClass().getSimpleName();

    }

    public void add(Object object) {
        map.put(object, object);

    }

    public void doOperation(Object object) {
        map.get(object);
    }
}
