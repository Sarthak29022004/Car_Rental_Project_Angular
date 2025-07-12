package Object_Oriented_Programing;

public class Wrapper_Classes {
    public static void main(String[] args) {
        Integer num = 45;
        final int a = 30;//you can't modify a  &&  always initialise final var otherwise it will be give the error

        final A abc = new A(14, "abc", 79.9f);
        abc.rno = 20;
//        A=new Student3();    you can't change abc reference to other objects

        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new A(10,"A",90.7f);
        }
    }
}

class A {
    final int a=10;

    int rno;
    String name;
    float marks;

    A(int rollNo, String Naam, float mark) {
        this.rno = rollNo;
        this.name = Naam;
        this.marks = mark;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is Destroyed");  //used to destroy the object
    }
}