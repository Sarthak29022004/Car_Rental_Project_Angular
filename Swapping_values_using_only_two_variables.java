public class Swapping_values_using_only_two_variables {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
