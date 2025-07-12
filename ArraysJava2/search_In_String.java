package ArraysJava2;

import java.util.Arrays;

public class search_In_String {
    public static void main(String[] args) {
        String name = "Sarthak";
        char target = 'h';
        System.out.println(name.toCharArray());  //Sarthak
        System.out.println(Arrays.toString(name.toCharArray()));  //[S, a, r, t, h, a, k]
        boolean s = search(name, target);  //always provide method type in variable type
        System.out.println(s);
    }

    static boolean search(String arr, char target) {
        for (char ch : arr.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
