import org.junit.Test;

import static org.junit.Assert.*;
public class TestAssertionsConstant {
    @Test
    public void testAssertionsConstant(){
        Constant constant = new Constant(10);

        double constantDer = constant.constantDerivative();
        double expectedDer = 0;
        assertEquals(expectedDer, constantDer, 0.01);

    }
}
