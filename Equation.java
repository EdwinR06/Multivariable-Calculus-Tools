import java.io.*;
import java.util.*;
import java.util.ListIterator;

public class Equation {
    private int numTerms;
    private ArrayList<ArrayList<Integer>> listTerms;

    public Equation(ArrayList<ArrayList <Integer>> list) {
        this.listTerms = list;
        this.numTerms = this.listTerms.size();
    }

    public double equationAtPoint(double x) {
        double result = 0;


        for (int i = 0; i < this.numTerms; i++) {
            if(this.listTerms.get(i).get(0) == 1){
                Sin sin = new Sin(this.listTerms.get(i).get(1), this.listTerms.get(i).get(2), this.listTerms.get(i).get(3));
                result += sin.calculateSin(x);
            } else if (this.listTerms.get(i).get(0) == 2){
                Cos cos = new Cos(this.listTerms.get(i).get(1), this.listTerms.get(i).get(2), this.listTerms.get(i).get(3));
                result += cos.calculateCos(x);
            }
        }
            
    
        return result;
    }
}