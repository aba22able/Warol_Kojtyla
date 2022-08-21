package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksDequeTest {

    @Test
    public void testUpdate() {
        // Given
        TasksDeque student1 = new FirstStudent();
        TasksDeque student2 = new SecondStudent();
        TasksDeque student3 = new SecondStudent();
        Mentor mentor1 = new Mentor("Mentor1");
        Mentor mentor2 = new Mentor("Mentor2");
        student1.registerObserver(mentor1);
        student1.registerObserver(mentor2);
        student2.registerObserver(mentor2);
        student3.registerObserver(mentor1);
        // When
        student1.addTask("21.3");
        student1.addTask("21.4");
        student2.addTask("6.8");
        student2.addTask("6.9");
        student3.addTask("37.1");
        student3.addTask("37.2");
        student1.addTask("21.5");
        student2.addTask("7.1");
        student3.addTask("37.3");
        student1.addTask("21.6");
        student2.addTask("7.2");
        // Then
        assertEquals(7, mentor1.getUpdateCount());
        assertEquals(8, mentor2.getUpdateCount());
    }
}