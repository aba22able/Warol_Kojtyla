package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Shape;

public class TaskFactory
{
    public static final String SHOPPINGTASK = "Shopping";
    public static final String PAINTINGTASK = "Painting";
    public static final String DRIVINGTASK = "Driving";

    public final Task makeTasks(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask(" ", "Kremówki", 2137);
            case PAINTINGTASK:
                return new PaintingTask(" ", "żółty", "papaj");
            case DRIVINGTASK:
                return new DrivingTask(" ", "El Vaticano", "Don Papa Mobile");
            default:
                return null;
        }
    }
}
