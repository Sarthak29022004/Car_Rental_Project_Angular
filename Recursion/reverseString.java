package Recursion;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(rString("Sarthak"));
    }

    static String rString(String a) {
        return reverse(0, a);
    }

    static String reverse(int i, String s) {  // S a r t h a k
        if (i == s.length()) return "";
//        return  s.charAt(i) + reverse(i + 1, s);      Sarthak
        return reverse(i + 1, s) + s.charAt(i);     //kahtraS
    }
}
