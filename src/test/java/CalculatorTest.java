import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAddNumbers() {
        int result = calculator.addNumbers(5, 2);
        assertEquals(7, result);
    }

    @Test
    public void canReduceNumbers() {
        int result = calculator.subtractNumbers(5, 2);
        assertEquals(3, result);
    }

    @Test
    public void canMultiplyNumbers() {
        int result = calculator.multiplyNumbers(5, 2);
        assertEquals(10, result);
    }

    @Test
    public void canDivideNumbers(){
        double results = calculator.divideNumbers(5, 2);
        assertEquals(2.5, results, 0.0);
    }

}
