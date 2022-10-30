public class VectorValuedFunction {
    private Equation x;
    private Equation y;
    private Equation z;

    public VectorValuedFunction(Equation x, Equation y, Equation z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Equation getX() {
        return this.x;
    }

    public Equation getY() {
        return this.y;
    }

    public Equation getZ() {
        return this.z;
    }

    public Vector3D position(double time) {
        final double xPos = this.x.equationAtPoint(time);
        final double yPos = this.y.equationAtPoint(time);
        final double zPos = this.z.equationAtPoint(time);

        final Vector3D positionVector = new Vector3D(xPos, yPos, zPos);
        return positionVector;
    }


    
}
