import java.util.Arrays;
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        int add = sum();
        System.out.println(add);

        String name2 = name();
        System.out.println(name2);

        String a = animal("Tiger");
        System.out.println(a);

        numb(5, 10);

        System.out.println(str(14));

        swap();
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st no. : ");
        int num1 = in.nextInt();
        System.out.print("Enter 1st no. : ");
        int num2 = in.nextInt();
        int num3 = num1 + num2;
        return num3;
    }

    static String name() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String nameM = in.next();
        return "Hello " + nameM;
    }

    static String animal(String Aname) {
        return "Powerfull " + Aname;
    }

    static int numb(int a, int b) {
        return a + b;
    }

    static String str(int a) {
        String s = "Sarthak roll no : " + a;
        return s;
//        return "Sarthak roll no : " + a;
    }

    static void swap() {
        int a = 10;
        int b = 20;
        //Swapping
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b =  " + b);
    }

}
