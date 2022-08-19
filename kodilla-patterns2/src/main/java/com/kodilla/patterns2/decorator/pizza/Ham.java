package com.kodilla.patterns2.decorator.pizza;

public class Ham extends AbstractPizzaOrderDecorator
{
    public Ham(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public int getCost() {
        return super.getCost() + 4;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+ ham ";
    }
}
