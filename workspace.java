import java.util.Scanner;
public class Workspace {
    public static void main(String args[])  {  
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Vector 1 X: ");
        double x1 = scanner.nextDouble();
        System.out.println("Enter Vector 1 Y: ");
        double y1 = scanner.nextDouble();
        System.out.println("Enter Vector 1 Z: ");
        double z1 = scanner.nextDouble();

        System.out.println("Enter Vector 2 X: ");
        double x2 = scanner.nextDouble();
        System.out.println("Enter Vector 2 Y: ");
        double y2 = scanner.nextDouble();
        System.out.println("Enter Vector 2 Z: ");
        double z2 = scanner.nextDouble();


        final Vector3D vector1 = new Vector3D(x1, y1, z1);
        final Vector3D vector2 = new Vector3D(x2, y2, z2);

        final Vector3D addition = vector1.add(vector2);

        final String s = String.format("x: %f, y: %f, z: %f", addition.getX(), addition.getY(), addition.getZ());

        System.out.println(s.toString());  //Displays result  
    }  
    
}
