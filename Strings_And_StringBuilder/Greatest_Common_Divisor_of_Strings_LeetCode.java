package Strings_And_StringBuilder;

import java.util.HashMap;

public class Greatest_Common_Divisor_of_Strings_LeetCode {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }

    static String gcdOfStrings(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(str1.charAt(i))) {
                break;
            }
            map.put(str1.charAt(i), 1);
            ans.append(str1.charAt(i));
        }
        String res = ans.toString();
        int s1=0;
        while (str1.length()>res.length() || s1==1){
            if (str1.substring(0,3)!=res){
                s1=0;
                break;
            }
            if (str1.length()==0){
                s1=1;
            }
            if (str1.substring(0,3)==res){
                str1=str1.substring(3,str1.length()-1);
            }

        }
        System.out.println(str1.substring(0,3));
        return "";
    }
}
