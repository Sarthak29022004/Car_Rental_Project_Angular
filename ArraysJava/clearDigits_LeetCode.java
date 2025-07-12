package ArraysJava;

public class clearDigits_LeetCode {
    public static void main(String[] args) {
        String s="Sarthak7";
        System.out.println(clearDigits(s));
    }
    static String clearDigits(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (stack.length() > 0) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}