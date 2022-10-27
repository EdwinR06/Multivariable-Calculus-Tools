import org.junit.Test;

import static org.junit.Assert.*;
public class TestAssertionsSin {
    @Test
    public void testAssertionsSin () {
        Sin sin = new Sin(1, 1, 1);

        double resultCalculate = sin.calculateSin(Math.PI / 2);
        double expectedCalculate = 1;
        assertEquals(expectedCalculate, resultCalculate, 0.01);
    }
}
