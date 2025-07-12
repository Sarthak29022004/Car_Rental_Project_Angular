package Recursion;

public class reverseStringSwap {
    public static void main(String[] args) {
        System.out.println(reverse("Nagesh"));
    }

    static String reverse(String name) {
        int n = name.length();
        if (n <= 1) return name;
        char left = name.charAt(0), right = name.charAt(n - 1);
        String substr = name.substring(1, n - 1);     //always use substring
        return right + reverse(substr) + left;
    }
}
