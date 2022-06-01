package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task
{
    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public boolean executeTask() {
        System.out.println("Processing...");
        System.out.println("Task " + getTaskName() + " executed...");

        return true;
    }

    @Override
    public String getTaskName() {
        taskName = "Driving";
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(boolean taskStatus) {
        if(taskStatus)
        {
            return true;
        } else {
            return false;
        }
    }
}
