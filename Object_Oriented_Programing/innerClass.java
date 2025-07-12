package Object_Oriented_Programing;


public class innerClass {   //outside classes cannot be static
    class A {

    }
//   1   4   16   64
    public static void main(String[] args) {
        System.out.println(cpof(22));
    }

    static boolean cpof(int n) {
        int store = 0;
        while (n > 0) {
            store = store * 10 + n % 4;
            n = n / 4;
        }
        System.out.println(store);
        return true;
    }
}
//4  =>1      ✔
//5  =>11     ✔
//6  =>21
//7  =>31
//8  =>2
//9  =>12
//10 =>22
//20 =>11     ✔
//21 =>111    ✔
//21 =>211
