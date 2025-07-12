import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 45, 67);
        multiple(5, 15, "Sarthak", "Nagesh", "Akshay");
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));  //[2, 3, 4, 5, 6, 45, 67]
    }

    static void multiple(int a, int b, String... v) {  //variable length args should always write at end
        System.out.println(a + b + " " + Arrays.toString(v));  //20 [Sarthak, Nagesh, Akshay]
    }
}
