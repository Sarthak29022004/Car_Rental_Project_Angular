package Object_Oriented_Programing.Inheritance;  //वारसा

public class BoxWeight extends Box{
    double weight = 7;
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l + " " + box.b + " " + box.h);
        Box box2 = new BoxWeight();
        BoxWeight b = new BoxWeight();
//        BoxWeight box3 = new Box();  you can not give parent class instance to child class reference variable
        call();
    }

    public void pr(){
        System.out.println(weight);
        System.out.println(super.weight);
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double l, double b, double h, double weight) {
        //super(l, b, h);
        super.l = l;
        super.b = b;
        super.h = h;
        this.weight = weight;
    }

    public BoxWeight() {
    }
}
