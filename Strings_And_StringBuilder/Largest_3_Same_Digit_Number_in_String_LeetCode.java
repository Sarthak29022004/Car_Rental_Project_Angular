package Strings_And_StringBuilder;

import java.util.HashMap;

public class Largest_3_Same_Digit_Number_in_String_LeetCode {
    public static void main(String[] args) {
        System.out.println(largestGoodInteger("2300019"));
    }

    static public String largestGoodInteger(String str) {
        String[] digits = {"999","888","777","666","555","444","333","222","111","000"};
        for (int i = 0; i < digits.length; i++) {
            if (str.contains(digits[i])){
                return digits[i];
            }
        }
        return "";
    }
}
//        HashMap<String, Integer> map = new HashMap<>();
//        int n = str.length();
//        int fLen = 0;
//        int lLen = 0;
//        for (int i = 0; i < n - 2; i++) {
//            if (str.charAt(i) == str.charAt(i + 1)) {
//                if (str.charAt(i + 1) == str.charAt(i + 2)) {
//                    fLen = i;
//                    lLen = i + 3;
//                    map.put(str.substring(fLen, lLen),(int)str.charAt(i));
//                }
//            }
//        }
//        String ans = str.substring(fLen, lLen);
//        for (String key:map.keySet()){
//            if (map.get(key)>map.get(ans)){
//                ans = key;
//            }
//        }
//        return ans;