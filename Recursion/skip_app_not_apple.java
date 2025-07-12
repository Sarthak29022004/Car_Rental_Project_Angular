package Recursion;

public class skip_app_not_apple {
    public static void main(String[] args) {
        System.out.println(skipApp("bsappleghappag"));  //bsappleghag
    }

    static String skipApp(String up) {
        if (up.isEmpty()) return "";
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipApp(up.substring(3));
        }
        return up.charAt(0) + skipApp(up.substring(1));
    }
}
