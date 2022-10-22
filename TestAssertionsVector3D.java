
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAssertionsVector3D {

    @Test
    public void testAssertions() {

        final Vector3D vector1 = new Vector3D(5, 6, 1);
        final Vector3D vector2 = new Vector3D(1, 2, 3);
        
        final Vector3D addition = vector1.add(vector2);
        Double[] resultAdd = {addition.getX(), addition.getY(), addition.getZ()};
        Double[] expectedAdd = {6.0, 8.0, 4.0};
        assertArrayEquals(expectedAdd, resultAdd);

        final Vector3D subtraction = vector1.subtract(vector2);
        Double[] resultSub = {subtraction.getX(), subtraction.getY(), subtraction.getZ()};
        Double[] expectedSub = {4.0, 4.0, -2.0};
        assertArrayEquals(expectedSub, resultSub);

        final Vector3D multiply = vector1.multiplyByScalar(2);
        Double[] resultMultiply = {multiply.getX(), multiply.getY(), multiply.getZ()};
        Double[] expectedMultiply = {10.0, 12.0, 2.0};
        assertArrayEquals(expectedMultiply, resultMultiply);

        final double dotProduct = vector1.dotProduct(vector2);
        assertTrue(dotProduct == 20.0);

        final Vector3D crossProduct1 = vector1.crossProduct(vector2);
        final Vector3D crossProduct2 = vector2.crossProduct(vector1);
        Double[] resultCross1 = {crossProduct1.getX(), crossProduct1.getY(), crossProduct1.getZ()};
        Double[] expectedCross1 = {16.0, -14.0, 4.0};
        Double[] resultCross2 = {crossProduct2.getX(), crossProduct2.getY(), crossProduct2.getZ()};
        Double[] expectedCross2 = {-16.0, 14.0, -4.0};
        assertArrayEquals(expectedCross1, resultCross1);
        assertArrayEquals(expectedCross2, resultCross2);
        // Cross Product is not commutative
        assertFalse(resultCross1 == resultCross2);

    }
}
