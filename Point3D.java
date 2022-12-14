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

    public double distanceFromPointToPlane(Plane3D a) {
        final double top = Math.abs(this.x * a.getX() + this.y * a.getY() + this.z * a.getZ() + a.getD());
        final double bottom = Math.sqrt(a.getX() * a.getX() + a.getY() * a.getY() + a.getZ() * a.getZ());
        final double distance = top / bottom;
        return distance;
    }

    public Plane3D planeFromPoints(Point3D b, Point3D c) {
        final Vector3D AB = this.vectorBetweenPoints(b);
        final Vector3D AC = this.vectorBetweenPoints(c);
        final Vector3D normal = AB.crossProduct(AC);
        final double d = normal.getX() * (-this.x) + normal.getY() * (-this.y) + normal.getZ() * (-this.z);

        final Plane3D plane = new Plane3D(normal.getX(), normal.getY(),normal.getZ(),d);
        return plane;
    }

}
