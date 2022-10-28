import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.xml.namespace.QName;

public class Workspace {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> equation = new ArrayList<ArrayList <Integer>>();
        ArrayList<Integer> term1 = new ArrayList<Integer>(Arrays.asList(0, 1, 1)); 
        equation.add(term1);
        Equation equation1 = new Equation(equation);
        System.out.println(equation1.equationAtPoint(1));
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vector Calculator Operation: ");
        String operation = scanner.nextLine();

        Vector3D vector2 = new Vector3D(0, 0, 0);
        Vector3D vector1 = new Vector3D(0, 0, 0);
        Point3D point2 = new Point3D(0, 0, 0);
        Point3D point1 = new Point3D(0, 0, 0);
        if(operation.equals("generate vector")) {
            System.out.println("Point 1");
            point1 = pointInput(scanner);
            System.out.println("Point 2");
            point2 = pointInput(scanner);
        } else {
            System.out.println("Vector 1");
            vector1 = vectorInput(scanner);

            if(operation.equals("multiply by scalar") || !operation.equals("magnitude") || !operation.equals("cylindrical coordinates") || !operation.equals("spherical coordinates")) {
                
            } else {
                System.out.println("Vector 2");
                vector2 = vectorInput(scanner);
            }
        } 
        
        
        

        System.out.println("Calculating ...");

        switch (operation) {
            case "add":
                final Vector3D addition = vector1.add(vector2);
                final String add = String.format("x: %f, y: %f, z: %f", addition.getX(), addition.getY(), addition.getZ());
                System.out.println(add.toString()); // Displays result
                break;

            case "subtract":
                final Vector3D subtraction = vector1.subtract(vector2);
                final String sub = String.format("x: %f, y: %f, z: %f", subtraction.getX(), subtraction.getY(), subtraction.getZ());
                System.out.println(sub.toString()); 
                break;
                
            case "multiply by scalar":
                System.out.println("Scalar: ");
                double scalar = scanner.nextDouble();

                final Vector3D multiply = vector1.multiplyByScalar(scalar);
                final String multi = String.format("x: %f, y: %f, z: %f", multiply.getX(), multiply.getY(), multiply.getZ());
                System.out.println(multi.toString()); 
                break;

            case "dot product":
                final double dotP = vector1.dotProduct(vector2);
                final String dot = String.format("Dot Product Result: %f", dotP);
                System.out.println(dot.toString()); 
                break;

            case "cross product":
                final Vector3D crossP = vector1.crossProduct(vector2);
                final String cross = String.format("x: %f, y: %f, z: %f", crossP.getX(), crossP.getY(), crossP.getZ());
                System.out.println(cross.toString()); 
                break;

            case "magnitude":
                final double magnitude = vector1.magnitude();
                final String mag = String.format("Magnitude of Vector: %f", magnitude);
                System.out.println(mag.toString()); 
                break;

            case "angle between":
                final double angleBetween = vector1.angleBetween(vector2);
                final String angle = String.format("Angle Between Vector One & Vector Two: %f", angleBetween);
                System.out.println(angle.toString()); 
                break;

            case "cylindrical coordinates":
                final Vector3D cylindrical = vector1.convertToCylindrical();
                final String cyl = String.format("Cylindrical Coordinates of Vector One:\nx: %f, y: %f, z: %f", cylindrical.getX(), cylindrical.getY(), cylindrical.getZ());
                System.out.println(cyl.toString()); 
                break;

            case "spherical coordinates":
                final Vector3D spherical = vector1.convertToSpherical();
                final String sphere = String.format("Cylindrical Coordinates of Vector One:\nx: %f, y: %f, z: %f", spherical.getX(), spherical.getY(), spherical.getZ());
                System.out.println(sphere.toString());
                break;
            
            case "generate vector":
                final Vector3D vectorP = point1.vectorBetweenPoints(point2);
                final String vectorPoints = String.format("x: %f, y: %f, z: %f", vectorP.getX(), vectorP.getY(), vectorP.getZ());
                System.out.println(vectorPoints.toString()); 
                break;

            default:
                System.out.println("Input Valid Vector Operation");
        }

    }

    public static Point3D pointInput(Scanner scanner){
        Point3D point;

        System.out.println("Enter Point X: ");
        double xP = scanner.nextDouble();
        System.out.println("Enter Point Y: ");
        double yP = scanner.nextDouble();
        System.out.println("Enter Point Z: ");
        double zP = scanner.nextDouble();
        point = new Point3D(xP, yP, zP);
        return point;

    }

    public static Vector3D vectorInput(Scanner scanner) {
        Vector3D vector;

        System.out.println("Enter Vector X: ");
        double xV = scanner.nextDouble();
        System.out.println("Enter Vector Y: ");
        double yV = scanner.nextDouble();
        System.out.println("Enter vector Z: ");
        double zV = scanner.nextDouble();
        vector = new Vector3D(xV, yV, zV);
        return vector;
    }

}
