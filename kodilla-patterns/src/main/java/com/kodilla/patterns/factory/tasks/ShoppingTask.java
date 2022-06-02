package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task
{
    private  String taskName;
    private  String whatToBuy;
    private  double quantity;
    boolean taskStatus = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public void executeTask() {
        taskStatus = true;
    }

    @Override
    public String getTaskName() {
        taskName = "Shopping";
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskStatus;
    }
}
