public class Vector3D {

    private double x;
    private double y;
    private double z;
    
    public Vector3D(double x, double y, double z) {
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
    
    public Vector3D add(Vector3D a) {
        final Vector3D vector = new Vector3D(this.x + a.x, this.y + a.y, this.z + a.z);
        return vector;
    }

    public Vector3D subtract(Vector3D a) {
        final Vector3D vector = new Vector3D(this.x - a.x, this.y - a.y, this.z - a.z);
        return vector;
    }

    public Vector3D multiplyByScalar(double scalar) {
        final Vector3D vector = new Vector3D(this.x * scalar, this.y * scalar, this.z * scalar);
        return vector;
    }

    public double dotProduct(Vector3D a) {
        final double product = (this.x * a.x) + (this.y * a.y) + (this.z * a.z);
        return product;
    }

    // Not commutative, follows right hand rule
    public Vector3D crossProduct(Vector3D a) {
        final double x = (this.y * a.z) - (this.z * a.y);
        final double y = (this.z * a.x) - (this.x * a.z);
        final double z = (this.x * a.y) - (this.y * a.x);
        final Vector3D vector = new Vector3D(x, y, z);
        return vector;
    }

    public double magnitude() {
        return Math.sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z));
    }

    public double angleBetween(Vector3D a) {
        final double angle = Math.toDegrees(Math.acos(this.dotProduct(a) / (this.magnitude() * a.magnitude())));
        return angle;
    }

    public Vector3D convertToCylindrical() {
        // Magnitude of XY Vector
        final double r = Math.sqrt(this.x * this.x + this.y * this.y);

        // Polar angle
        final double theta = Math.toDegrees(Math.atan(this.y / this.x));

        // final double x = r * Math.cos(theta);
        // final double y = r * Math.sin(theta);

        final double z = this.z;
        final Vector3D vector = new Vector3D(r, theta, z);
        return vector;
    }

    public Vector3D convertToSpherical() {
        final double r = Math.sqrt(this.x * this.x + this.y * this.y);

        //distance from the center
        final double rho = Math.sqrt(r * r + this.z * this.z);

        // Polar angle (latitude)
        final double theta = Math.toDegrees(Math.atan(this.y / this.x));

        // angle between the positive direction of z-axis and OP
        final double phi = Math.toDegrees(Math.atan(r / this.z));

        final Vector3D vector = new Vector3D(rho, theta, phi);
        return vector;
    }


}