package com.kodilla.patterns2.decorator.pizza;

public class Pineapple extends AbstractPizzaOrderDecorator
{
    public Pineapple(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public int getCost() {
        return super.getCost() + 666;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+ pineapple ";
    }
}
