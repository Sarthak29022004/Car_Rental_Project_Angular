package Object_Oriented_Programing.Inheritance;

public class Box {
    double l;
    double b;
    double h;
    double weight = 9;

    Box() {
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    public Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public static void call(){
        System.out.println("CALL");
    }
}
