package Object_Oriented_Programing;

public class staticBlock {
    static int a = 10;
    static int b;
    static {               //call only one time  फक्त एकदाच call होते
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println(staticBlock.a + " " + staticBlock.b);//I am in static block  10 50

        staticBlock.b +=3;
        System.out.println(staticBlock.a + " " + staticBlock.b);// 10 53
        //एकदा static block call झाल्यामुळे ह्या वेळी call झाला नाही
    }
}
