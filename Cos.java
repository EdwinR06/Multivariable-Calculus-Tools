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

    

    
}