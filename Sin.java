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

    public Cos sinDerivative(){
        final Cos cos;
        if(this.exponent > 1) {
            cos = new Cos(this.coefficient * this.exponent * this.period, this.period, this.exponent - 1); 
        } else {
            cos = new Cos(this.coefficient * this.period, this.period, this.exponent); 
        }
        return cos;
    }


}
