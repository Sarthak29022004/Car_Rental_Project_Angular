package Strings_And_StringBuilder;

public class prettyPrinting {
    public static void main(String[] args) {
        float a = 453.123456f;
        System.out.printf("Formatted number is %.3f", a);  //Formatted number is 453.123
        System.out.printf("Formatted number is %.2f", a);  //Formatted number is 453.12
        float b = 453.1f;
        System.out.printf("Formatted number is %.3f", b);  //Formatted number is 45.100
        System.out.printf("Formatted number is %.2f", b);  //Formatted number is 453.10
        float c = 453f;
        System.out.printf("Formatted number is %.2f", c);  //Formatted number is 453.00
        System.out.println();

        System.out.println(Math.PI);  //3.141592653589793
        System.out.printf("Pie : %.3f", Math.PI);   //Pie : 3.142

        System.out.println();
        System.out.printf("Hello my name is %s and i am %s","Pittu","Cool");//Hello my name is Pittu and i am Cool
    }
}
