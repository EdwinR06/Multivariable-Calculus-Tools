import org.junit.Test;
import static org.junit.Assert.*;

public class TestAssertions {

    @Test
    public void testAssertions() {

        final Vector3D vector1 = new Vector3D(5, 6, 1);
        final Vector3D vector2 = new Vector3D(1, 2, 3);
        final Vector3D addition = vector1.add(vector2);
        
        Double[] result = {addition.getX(), addition.getY(), addition.getZ()};
        Double[] expectedArray = {6.0, 8.0, 4.0};
        assertArrayEquals(expectedArray, result);
        
    }
}
