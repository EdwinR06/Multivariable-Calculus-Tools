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


    
}
