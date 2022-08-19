package com.kodilla.patterns2.decorator.pizza;

public class BasicPizza implements PizzaOrder
{
    @Override
    public int getCost() {
        return 15;
    }

    @Override
    public String getDescription() {
        return "You have ordered a pizza(dough, tomato sauce, cheese) ";
    }
}
