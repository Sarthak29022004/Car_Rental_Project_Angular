package Strings_And_StringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');  //195
        System.out.println("a" + "b");  //ab
        System.out.println('a' + 3);    //100
        System.out.println((char) ('a' + 3));    //d

        System.out.println("a" + 1);  //a1
        //int will be converted to Integer that will call toString()
        //this is same as after a few steps : "a" + "1"

        System.out.println("Sarthak" + new Integer(56));  //Sarthak56
        System.out.println(new Integer(56) +"" +new ArrayList<>());  //56[]
        //In println use at-least one object should be type string otherwise it will be give the error
    }
}
