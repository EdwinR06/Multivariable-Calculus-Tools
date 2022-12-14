
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

        final double magnitude = vector1.magnitude();
        assertTrue(magnitude == Math.sqrt(25+36+1));

        final double angle = vector1.angleBetween(vector2);
        assertEquals(47.246607, angle, .001);

        final Vector3D cylindrical = vector1.convertToCylindrical();
        Double[] resultCyl = {cylindrical.getX(), cylindrical.getY(), cylindrical.getZ()};
        Double[] expectedCyl = {7.810249675906654, 50.19442890773481, 1.0};
        assertArrayEquals(expectedCyl, resultCyl);

        final Vector3D spherical = vector1.convertToSpherical();
        Double[] resultSphere = {spherical.getX(), spherical.getY(), spherical.getZ()};
        Double[] expectedSphere = {7.87400787401181, 50.19442890773481, 82.7037246989833};
        assertArrayEquals(expectedSphere, resultSphere);

        final Vector3D normalized = vector1.normalize();
        double[] resultNormalized = {normalized.getX(), normalized.getY(), normalized.getZ()};
        double[] expectedNormalized = {0.635, 0.762, 0.127};
        assertArrayEquals(expectedNormalized, resultNormalized, 0.01);
    
    }
}
