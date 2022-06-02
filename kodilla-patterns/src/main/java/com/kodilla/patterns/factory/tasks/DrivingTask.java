package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task
{
    private String taskName;
    private String where;
    private String using;
    boolean taskStatus = false;

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
    public void executeTask() {
        taskStatus = true;
    }

    @Override
    public String getTaskName() {
        taskName = "Driving";
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskStatus;
    }
}
