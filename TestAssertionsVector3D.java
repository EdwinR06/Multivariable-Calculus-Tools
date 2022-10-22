
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

    }
}
