package Strings_And_StringBuilder;

public class performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.println(ch);  //System.out.println((char) ('a' + i));
            series += ch;
        }
        System.out.println(series);  //abcdefghijklmnopqrstuvwxyz
        System.out.println("a"+'b'); //ab  if one data type in string then another data type converted into string
        //  O(n^2)
    }
}
