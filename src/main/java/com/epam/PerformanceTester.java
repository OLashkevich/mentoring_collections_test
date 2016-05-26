package com.epam;

import com.epam.operation.IOperation;

import java.util.Date;

/**
 * @author Olga Lashkevich
 */
public class PerformanceTester {

    private IOperation operation;
    private int initialCount;
    private int repeatCount;

    public PerformanceTester(IOperation operation, int initialCount, int repeatCount) {
        this.operation = operation;
        this.initialCount = initialCount;
        this.repeatCount = repeatCount;
    }

    public void test() {
        for (int i = 0; i < initialCount; i++) {
            operation.add(DataGenerator.random(initialCount));
        }
        Date dateStart = new Date();
        for (int i = 0; i < repeatCount; i++) {
            operation.doOperation(DataGenerator.random(initialCount));
        }
        Date dateFinish = new Date();
        double dateOneOperation = (dateFinish.getTime() - dateStart.getTime()) / (double) repeatCount;
        System.out.println("The average operation time " + operation.getMessage() + ": " + dateOneOperation);
    }


}
