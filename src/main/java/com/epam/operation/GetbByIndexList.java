package com.epam.operation;

import java.util.List;

/**
 * @author Olga Lashkevich
 */
public class GetbByIndexList implements IOperation {

    private List list;

    public GetbByIndexList(List list) {
        this.list = list;
    }

    public String getMessage() {
        return "Get element by index from " + list.getClass().getSimpleName();
    }

    public void add(Object object) {
        list.add(object);

    }

    public void doOperation(Object object) {
        list.get((Integer) object);
    }
}
