package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite
{
    @Autowired
    Calculator calculator;

    @Test
    public void testCalculationsAdd()
    {
        //Given
        //When
        double addingResult = calculator.add(2, 2);
        //Then
        Assertions.assertEquals(4, addingResult);
    }

    @Test
    public void testCalculationsSub()
    {
        //Given
        //When
        double subResult = calculator.sub(2, 2);
        //Then
        Assertions.assertEquals(0, subResult);
    }

    @Test
    public void testCalculationsMul()
    {
        //Given
        //When
        double mulResult = calculator.mul(2, 2);
        //Then
        Assertions.assertEquals(4, mulResult);
    }

    @Test
    public void testCalculationsDiv()
    {
        //Given
        //When
        double divResult = calculator.div(2, 2);
        //Then
        Assertions.assertEquals(1, divResult);
    }
}
