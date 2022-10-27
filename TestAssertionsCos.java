import org.junit.Test;

import static org.junit.Assert.*;
public class TestAssertionsCos {
    @Test
    public void testAssertionsCos () {
        Cos cos = new Cos(1, 1, 1);

        double resultCalculate = cos.calculateCos(Math.PI / 2);
        double expectedCalculate = 0;
        assertEquals(expectedCalculate, resultCalculate, 0.01);
    }
}
