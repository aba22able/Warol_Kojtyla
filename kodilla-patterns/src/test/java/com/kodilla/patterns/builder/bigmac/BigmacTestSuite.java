package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite
{
    @Test
    void testBigmacNew() {
        //Given
        Bigmac myBigMac = new Bigmac.BigMacBuilder()
                .ingredients("Bacon")
                .bun("Regular")
                .ingredients("Tomato")
                .ingredients("Cheese")
                .burgers("Well Done")
                .sauce("Ketchup")
                .build();
        System.out.println(myBigMac);
        //When
        int howManyIngredients = myBigMac.getIngredients().size();
        String bun = myBigMac.getBun();
        String sauce = myBigMac.getSauce();
        //Then
        assertEquals(3, howManyIngredients);
        assertEquals("Regular", bun);
        assertEquals("Ketchup", sauce);
    }
}
