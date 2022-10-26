public class Sin {
    private double coefficient;
    private double period;
    private double exponent;

    public Sin(double coefficient, double period, double exponent){
        this.coefficient = coefficient;
        this.period = period;
        this.exponent = exponent;
    }

    

    public double calculateSin(double x) {
        final double sin = this.coefficient * Math.pow(Math.sin(this.period * x), this.exponent);
        return sin;
    }

    

    
}
