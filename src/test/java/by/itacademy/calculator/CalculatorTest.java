package by.itacademy.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        float expected = 2.0f;
        float a = 1.0f;
        float b = 1.0f;

        float actual = calculator.add(a, b);

        Assert.assertEquals(expected,actual,0.1);

    }

}
