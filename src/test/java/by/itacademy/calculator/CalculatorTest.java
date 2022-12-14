package by.itacademy.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest{

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        float expected = 2.0f;
        float a = 1.0f;
        float b = 1.0f;

        float actual = calculator.add(a, b);

        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        float expected = 5.0f;
        float a = 10.0f;
        float b = 5.0f;

        float actual = calculator.subtract(a, b);

        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        float expected = 25.0f;
        float a = 5.0f;
        float b = 5.0f;

        float actual = calculator.multiply(a, b);

        Assert.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void testDivide(){
        Calculator calculator = new Calculator();
        float expected = 8.0f;
        float a = 16.0f;
        float b = 2.0f;

        float actual = calculator.divide(a, b);

        Assert.assertEquals(expected, actual, 0.1);
    }
}
