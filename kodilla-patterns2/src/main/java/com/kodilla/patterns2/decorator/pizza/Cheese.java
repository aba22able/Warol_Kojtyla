package com.kodilla.patterns2.decorator.pizza;


import java.math.BigDecimal;

public class Cheese extends AbstractPizzaOrderDecorator
{
    public Cheese(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public int getCost() {
        return super.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+ extra cheese ";
    }
}
