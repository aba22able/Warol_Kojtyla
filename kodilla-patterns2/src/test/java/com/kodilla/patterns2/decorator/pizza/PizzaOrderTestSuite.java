package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite
{
    @Test
    public void testPizzaOrderGetCost() {
        // Given
        PizzaOrder thePizza = new BasicPizza();
        thePizza = new Cheese(thePizza);
        thePizza = new Ham(thePizza);
        thePizza = new Olives(thePizza);
        // When
        int calculatedCost = thePizza.getCost();
        System.out.println(calculatedCost);
        // Then
        assertEquals(27, calculatedCost);
    }

    @Test
    public void testPizzaOrderGetDescription() {
        // Given
        PizzaOrder thePizza = new BasicPizza();
        thePizza = new Cheese(thePizza);
        thePizza = new Ham(thePizza);
        thePizza = new Olives(thePizza);
        // When
        String description = thePizza.getDescription();
        System.out.println(description);
        // Then
        assertEquals("You have ordered a pizza(dough, tomato sauce, cheese) + extra cheese + ham + olives ", description);
    }
}
