package com.kodilla.patterns2.decorator.pizza;

public class Olives extends AbstractPizzaOrderDecorator
{
    public Olives(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+ olives ";
    }
}
