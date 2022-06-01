package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task
{
    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    @Override
    public boolean executeTask() {
        System.out.println("Processing...");
        System.out.println("Task " + getTaskName() + " executed...");

        return true;
    }

    @Override
    public String getTaskName() {
        taskName = "Painting";
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
