public class Workspace {
    public static void main(String args[])  
    {  
        final Vector3D vector1 = new Vector3D(5, 6, 1);
        final Vector3D vector2 = new Vector3D(1, 2, 3);

        final Vector3D addition = vector1.add(vector2);

        final String s = String.format("x: %f, y: %f, z: %f", addition.getX(), addition.getY(), addition.getZ());

        System.out.println(s.toString());  //Displays result  
    }  
    
}
