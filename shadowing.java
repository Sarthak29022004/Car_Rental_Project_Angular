public class shadowing {

    static int x = 90;  //shadowed at line 9

    public static void main(String[] args) {
        System.out.println(x); //90
        x = 40;
        int x = 50;
        System.out.println(x); //50
        fun();
        fun2();
    }

    static void fun() {
        System.out.println(x);  //40
    }

    static void fun2(){
        int x;
//        System.out.println(x);  Variable 'x' might not have been initialized. first initialize like (x=10)E
    }
}
