import org.junit.Test;

import static org.junit.Assert.*;

public class TestAssertionsPoint3D {
    @Test
    public void testAssertionsPoint3D () {
        Point3D point = new Point3D(1, 1, 1);
        Plane3D plane = new Plane3D(5, 1, 1, -3);

        final double distance = point.distanceFromPointToPlane(plane);
        final double expectedDistance = 0.7698003589195009;

        assertEquals(expectedDistance, distance, 0.01);
    }
}
