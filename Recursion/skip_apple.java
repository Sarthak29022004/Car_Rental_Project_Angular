package Recursion;

public class skip_apple {
    public static void main(String[] args) {
        System.out.println(skipApple("bsappleag"));  //bsag
    }

    static String skipApple(String up) {
        if (up.isEmpty()) return "";
        if (up.startsWith("apple")) return skipApple(up.substring(5));
        return up.charAt(0) + skipApple(up.substring(1));
    }
}
