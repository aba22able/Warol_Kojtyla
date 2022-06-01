package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite
{
    @Test
    public void shoppingTaskFactoryTest()
    {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTasks(TaskFactory.SHOPPINGTASK);

        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertEquals(true, shopping.isTaskExecuted(shopping.executeTask()));
    }

    @Test
    public void paintingTaskFactoryTest()
    {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTasks(TaskFactory.PAINTINGTASK);

        //Then
        assertEquals("Painting", painting.getTaskName());
        assertEquals(true, painting.isTaskExecuted(painting.executeTask()));
    }

    @Test
    public void drivingTaskFactoryTest()
    {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTasks(TaskFactory.DRIVINGTASK);

        //Then
        assertEquals("Driving", driving.getTaskName());
        assertEquals(true, driving.isTaskExecuted(driving.executeTask()));
    }
}
