package Object_Oriented_Programing;

public class Class3 {
    public static void main(String[] args) {
        Student2 pittu = new Student2(14,"Pittu",86.8f);
        Student2 sarthak = new Student2(15,"sarthak",90);
        Student2 akshay = new Student2(16,"akshay",92.4f);
        System.out.println(pittu.rno);
        System.out.println(pittu.name);
        System.out.println(pittu.marks);
        System.out.println(sarthak.rno);
        System.out.println(sarthak.name);
        System.out.println(sarthak.marks);
        System.out.println(akshay.rno);
        System.out.println(akshay.name);
        System.out.println(akshay.marks);

        Student2 empty = new Student2();
    }
}

class Student2 {
    int rno;
    String name;
    float marks;

    Student2() {      //when you don't create empty Student2 Constructor then you can't create => Student2 empty = new Student2();
        this.rno = 0;
        this.name = "";
        this.marks = 0.0f;
    }

    Student2(int rollNo, String Naam, float mark) {
        this.rno = rollNo;
        this.name = Naam;
        this.marks = mark;
    }
}
