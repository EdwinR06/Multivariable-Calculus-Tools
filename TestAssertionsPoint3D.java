import org.junit.Test;

import static org.junit.Assert.*;

public class TestAssertionsPoint3D {
    @Test
    public void testAssertionsPoint3D () {
        Point3D point = new Point3D(1, 1, 1);
        Point3D point5 = new Point3D(3, 2, 2);
        Point3D point6 = new Point3D(1, 5, 0);
        Plane3D plane = new Plane3D(5, 1, 1, -3);

        
        final Vector3D vector = point.vectorBetweenPoints(point6);
        double[] resultVector = {vector.getX(), vector.getY(), vector.getZ()};
        double[] expectedVector = {0, 4, -1};
        assertArrayEquals(expectedVector, resultVector, 0.01);

        final double distance = point.distanceFromPointToPlane(plane);
        final double expectedDistance = 0.7698003589195009;
        assertEquals(expectedDistance, distance, 0.01);

        Plane3D plane1 = point.planeFromPoints(point5, point6);
        Double[] resultPlane = {plane1.getX(), plane1.getY(), plane1.getZ(), plane1.getD()};
        Double[] expectedPlane = {-5.0, 2.0, 8.0, -5.0};
        assertArrayEquals(expectedPlane, resultPlane);

    }
}
