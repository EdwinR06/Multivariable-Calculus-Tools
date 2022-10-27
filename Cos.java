public class Cos {
    private double coefficient;
    private double period;
    private double exponent;

    public Cos(double coefficient, double period, double exponent){
        this.coefficient = coefficient;
        this.period = period;
        this.exponent = exponent;
    }

    public double calculateCos(double x) {
        final double cos = this.coefficient * Math.pow(Math.cos(this.period * x), this.exponent);
        return cos;
    }

    public Sin cosDerivative() {
        final Sin sin;
        if(this.exponent > 1) {
            sin = new Sin(-1 * this.coefficient * this.exponent * this.period, this.period, this.exponent - 1); 
        } else {
            sin = new Sin(-1 * this.coefficient * this.period, this.period, this.exponent); 
        }
        return sin;
    }

    public double getCoefficient() {
        return this.coefficient;
    }

    public double getPeriod() {
        return this.period;
    }

    public double getExponent() {
        return this.exponent;
    }

}