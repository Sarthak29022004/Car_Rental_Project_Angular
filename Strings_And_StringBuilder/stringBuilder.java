package Strings_And_StringBuilder;

import java.util.Arrays;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<26;i++){
            char ch = (char) ('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);      //abcdefghijklmnopqrstuvwxyz

        builder.deleteCharAt(0);
        System.out.println(builder);     //bcdefghijklmnopqrstuvwxyz

        builder.reverse();
        System.out.println(builder);     //zyxwvutsrqponmlkjihgfedcb

        System.out.println(builder.toString());   //zyxwvutsrqponmlkjihgfedcb

        String name = "Sarthak Bobhate";
        System.out.println(name.toCharArray());  //Sarthak Bobhate
        System.out.println(Arrays.toString(name.toCharArray()));  //[S, a, r, t, h, a, k,  , B, o, b, h, a, t, e]

        System.out.println(name.indexOf('a'));   //1
        System.out.println("      Pittu     ".strip());  //Pittu
        System.out.println("      Pittu     ".trim());  //Pittu

        String hello = "Hello from Sarthak Bobhate";
        System.out.println(Arrays.toString(hello.split(" ")));  //[Hello, from, Sarthak, Bobhate]

        String n = "Sarthak";
        System.out.println(Arrays.toString(n.split("")));  //[S, a, r, t, h, a, k]


    }
}
