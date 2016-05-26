package com.epam;

import com.epam.operation.*;

import java.util.*;

/**
 * @author Olga Lashkevich
 */
public class Main {

    public static void main(String[] args) {

        PerformanceTester performanceTester = new PerformanceTester(new AddToList(new ArrayList()), 10000, 10000);
        performanceTester.test();

        performanceTester = new PerformanceTester(new AddToList(new LinkedList()), 10000, 10000);
        performanceTester.test();

        performanceTester = new PerformanceTester(new AddToSet(new HashSet()), 10000, 10000);
        performanceTester.test();

        performanceTester = new PerformanceTester(new AddToSet(new TreeSet()), 10000, 10000);
        performanceTester.test();

        performanceTester = new PerformanceTester(new AddToMap(new HashMap()), 10000, 10000);
        performanceTester.test();

        performanceTester = new PerformanceTester(new AddToMap(new TreeMap()), 10000, 10000);
        performanceTester.test();

        performanceTester = new PerformanceTester(new GetbByIndexList(new LinkedList()), 10000, 10000);
        performanceTester.test();

        performanceTester = new PerformanceTester(new GetbByIndexList(new ArrayList()), 10000, 10000);
        performanceTester.test();

        performanceTester = new PerformanceTester(new GetByKeyMap(new HashMap()), 10000, 10000);
        performanceTester.test();

        performanceTester = new PerformanceTester(new GetByKeyMap(new TreeMap()), 10000, 10000);
        performanceTester.test();

        performanceTester = new PerformanceTester(new RemoveFromMap(new TreeMap()), 10000, 10000);
        performanceTester.test();

        performanceTester = new PerformanceTester(new RemoveFromMap(new HashMap()), 10000, 10000);
        performanceTester.test();

    }
}
