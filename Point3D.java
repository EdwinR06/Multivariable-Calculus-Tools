public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public Vector3D vectorBetweenPoints(Point3D a) {
        // Generates Vector3D as Change in XYZ from Current Point tp Point A
        final Vector3D vector = new Vector3D(a.getX() - this.x, a.getY() - this.y, a.getZ() - this.z);
        return vector;
    } 

}
