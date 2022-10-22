public class Vector3D {

    private int x;
    private int y;
    private int z;
    
    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D addition3D(Vector3D a, Vector3D b) {
        final Vector3D vector = new Vector3D(a.x + b.x, a.y + b.y, a.z + b.z);
        return vector;
    }


}