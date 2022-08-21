package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer
{
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TasksDeque tasksDeque) {
        System.out.println(name + ": New task is available -" + tasksDeque.getStudentName() + "\n" +
                " (total: " + tasksDeque.getQueue().size() + " task/s in the queue)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
