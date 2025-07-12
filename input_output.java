import java.util.*;

public class input_output {
    public static void main (String [] args) {
        System.out.println("Sarthak Sanjay Bobhate");
        System.out.print("Enter the number: "); // print is method
        Scanner sc = new Scanner(System.in); // scanner & system is a class, in & out is members of system class
        int a = sc.nextInt();
        System.out.println("The no. is " + a);

        System.out.print("Enter the String: ");
        String user = sc.nextLine(); // input for String value

        System.out.print("Enter the int: ");
        int p = sc.nextInt(); // input for int value

        System.out.print("Enter the float: ");
        float q = sc.nextFloat(); // input for float value

        System.out.print("Enter the boolean: ");
        boolean r = sc.nextBoolean(); // input for boolean value

        System.out.print("Enter the double: ");
        double s = sc.nextDouble(); // input for double value

        System.out.println("The String is : " + user);
        System.out.println("The int is : " + p);
        System.out.println("The float is : " + q);
        System.out.println("The boolean is : " + r);
        System.out.println("The double is : " + s);

        sc.close();
    }
}