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
        shopping.executeTask();

        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void paintingTaskFactoryTest()
    {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTasks(TaskFactory.PAINTINGTASK);
        painting.executeTask();

        //Then
        assertEquals("Painting", painting.getTaskName());
        assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void drivingTaskFactoryTest()
    {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTasks(TaskFactory.DRIVINGTASK);
        driving.executeTask();

        //Then
        assertEquals("Driving", driving.getTaskName());
        assertEquals(true, driving.isTaskExecuted());
    }
}
