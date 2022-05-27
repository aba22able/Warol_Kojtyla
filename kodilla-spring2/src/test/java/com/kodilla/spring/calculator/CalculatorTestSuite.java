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
    public void testCalculations()
    {
        //Given
        //When
        double addingResult = calculator.add(2, 2);
        double subResult = calculator.sub(2, 2);
        double mulResult = calculator.mul(2, 2);
        double divResult = calculator.div(2, 2);
        //Then
        Assertions.assertEquals(4, addingResult);
        Assertions.assertEquals(0, subResult);
        Assertions.assertEquals(4, mulResult);
        Assertions.assertEquals(1, divResult);
    }
}
