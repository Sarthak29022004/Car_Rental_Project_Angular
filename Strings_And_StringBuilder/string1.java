package Strings_And_StringBuilder;

public class string1 {
    public static void main(String[] args) {
        String a = "Sarthak";
        String b = "Sarthak";
        a = "Bobhate";
        System.out.println(b + a);//SarthakBobhate

        String c = new String("Sarthak");
        System.out.println(b == c);  //false

        String name = new String("Nagesh");
        String name2 = new String("Nagesh");
        System.out.println(name == name2);   //false    it check pointing
        System.out.println(name.equals(name2));   //true  It don't care about pointing, it just checks values

        String d = "Akshay";
        String e = d;
        d = "Khanna";
        System.out.println(e + d);   //AkshayKhanna


    }
}
