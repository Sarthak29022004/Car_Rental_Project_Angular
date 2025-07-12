package Strings_And_StringBuilder;

public class Add_Strings_LeetCode {
    public static void main(String[] args) {
        System.out.println(addStrings("6913259244","71103343"));
    }

    static String addStrings(String num1, String num2) {
        long n1 = Integer.parseInt(num1);
        long n2 = Integer.parseInt(num2);
        long n = n1+n2;
        String ans = Long.toString(n);
        return ans;
    }
}
