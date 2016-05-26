package com.epam.operation;

import java.util.Set;

/**
 * @author Olga Lashkevich
 */
public class AddToSet implements IOperation {

    private Set set;

    public AddToSet (Set set){
        this.set = set;
    }

    public String getMessage() {
        return "add element to " + set.getClass().getSimpleName();
    }

    public void add(Object object) {
        set.add(object);

    }

    public void doOperation(Object object) {
        set.add(object);
    }
}
