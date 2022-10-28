import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class TestAssertionsEquation {
    @Test
    public void testAssertionsEquation(){
        ArrayList<ArrayList<Integer>> equation = new ArrayList<ArrayList <Integer>>();
        ArrayList<Integer> term1 = new ArrayList<Integer>(Arrays.asList(0, 1, 2));
        ArrayList<Integer> term2 = new ArrayList<Integer>(Arrays.asList(0, 1, 1)); 
        ArrayList<Integer> term3 = new ArrayList<Integer>(Arrays.asList(3, 4));  
        equation.add(term1);
        equation.add(term2);
        equation.add(term3);
        // x^2 + x + 4 = y
        Equation equation1 = new Equation(equation);
        

        double equationResult = equation1.equationAtPoint(2);
        double expectedEquation = 10;
        assertEquals(expectedEquation, equationResult, 0.01);

        
    }
}
