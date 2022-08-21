package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TasksDeque implements Observable
{
    private final List<Observer> observers;
    private final Deque<String> queue;
    private final String studentName;

    public TasksDeque(String studentName) {
        observers = new ArrayList<>();
        queue = new ArrayDeque<>();
        this.studentName = studentName;
    }

    public void addTask(String task)
    {
        queue.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Deque<String> getQueue() {
        return queue;
    }

    public String getStudentName() {
        return studentName;
    }
}
