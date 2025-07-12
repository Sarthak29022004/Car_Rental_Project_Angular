import java.util.Arrays;

public class funOverloading {
    public static void main(String[] args) {
        fun(5);
        fun("Sarthak");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }

    static void fun(String ...name) {
        System.out.println(Arrays.toString(name)); //no call in one args
    }
}
