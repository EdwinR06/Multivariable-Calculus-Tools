public class Constant {
    private double coefficient;

    public Constant(double coefficient) {
        this.coefficient = coefficient;
    }

    public double constantDerivative() {
        return 0;
    }

    public double getConstant() {
        return this.coefficient;
    }
}
