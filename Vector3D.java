public class Vector3D {

    private int x;
    private int y;
    private int z;
    
    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D add(Vector3D a, Vector3D b) {
        final Vector3D vector = new Vector3D(a.x + b.x, a.y + b.y, a.z + b.z);
        return vector;
    }

    public Vector3D subtract(Vector3D a, Vector3D b) {
        final Vector3D vector = new Vector3D(a.x - b.x, a.y - b.y, a.z - b.z);
        return vector;
    }

    public Vector3D multiplyByScalar(Vector3D a, int scalar) {
        final Vector3D vector = new Vector3D(a.x * scalar, a.y * scalar, a.z * scalar);
        return vector;
    }

    public int dotProduct(Vector3D a, Vector3D b) {
        final int product = (a.x * b.x) + (a.y * b.y) + (a.z * b.z);
        return product;
    }


    // Not commutative, follows right hand rule
    public Vector3D crossProduct(Vector3D a, Vector3D b) {
        final int x = (a.y * b.z) - (a.z * b.y);
        final int y = (a.z * b.x) - (a.x * b.z);
        final int z = (a.x * b.y) - (a.y * b.x);
        final Vector3D vector = new Vector3D(x, y, z);
        return vector;
    }

    public double magnitude(Vector3D a) {
        return Math.sqrt((a.x * a.x) + (a.y * a.y) + (a.z * a.z));
    }

    public double angleBetween(Vector3D a, Vector3D b) {
        final double angle = Math.acos(dotProduct(a, b) / (magnitude(a) * magnitude(b)));
        return angle;
    }
}