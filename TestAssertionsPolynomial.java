import org.junit.Test;

import static org.junit.Assert.*;
public class TestAssertionsPolynomial {
    @Test
    public void testAssertionsPolynomial() {
        Polynomial polynomial = new Polynomial(1, 2);

        double polynomialValue = polynomial.calculatePoly(2);
        double expectedPolynomial = 4;
        assertEquals(expectedPolynomial, polynomialValue, 0.01);

        Polynomial polynomialDerivative = polynomial.polynomialDerivative();
        double[] resultPolynomialDer = {polynomialDerivative.getCoefficient(), polynomialDerivative.getExponent()};
        double[] expectedPolynomialDer = {2, 1};
        assertArrayEquals(expectedPolynomialDer, resultPolynomialDer, 0.01);
    }
}
