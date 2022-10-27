public class Polynomial {
    private double coefficient;
    private double exponent;
    
    public Polynomial(double coefficient, double exponent){
        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    public double calculatePoly(double x) {
        final double result = this.coefficient * Math.pow(x, this.exponent);
        return result;
    }

    public double getCoefficient() {
        return this.coefficient;
    }

    public double getExponent() {
        return this.exponent;
    }
}
