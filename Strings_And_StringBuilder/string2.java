package Strings_And_StringBuilder;

import java.util.Arrays;

public class string2 {
    public static void main(String[] args) {
        String a = "Sarthak";
        System.out.println(a.charAt(0)); //S
        System.out.println(new int[]{1, 2, 3, 4, 5, 6});    //[I@7b23ec81
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5, 6}));  //[1, 2, 3, 4, 5, 6]

        Integer num = new Integer(56);//you can do many op using num.
        System.out.println(num);  //56
        System.out.println(a.substring(0));  //Sarthak
        System.out.println(a.substring(0, 5));         //Sarth
    }
}
