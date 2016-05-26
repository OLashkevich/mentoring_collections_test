package com.epam.operation;

import java.util.List;

/**
 * @author Olga Lashkevich
 */
public class AddToList implements IOperation {

    private List list;

    public AddToList(List list) {
        this.list = list;
    }

    public String getMessage() {
        return "add element to " + list.getClass().getSimpleName();
    }

    public void add(Object object) {
        list.add(object);

    }

    public void doOperation(Object object) {

        list.add(object);
    }

}
